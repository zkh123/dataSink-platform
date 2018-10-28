package com.dataSink.platform.controller;

import com.alibaba.fastjson.JSONObject;
import com.dataSink.platform.App;
import com.dataSink.platform.entity.User;
import com.dataSink.platform.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huanglijun on 2018/10/29.
 */
@Controller
public class UserController {

    private static Logger logger= Logger.getLogger(App.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get")
    @ResponseBody
    public User getUserByID(@RequestParam(value = "id",required = true)int id){
        User user = userService.GetUserByID(id);
        logger.info(JSONObject.toJSONString(user));
        return user;
    }
}
