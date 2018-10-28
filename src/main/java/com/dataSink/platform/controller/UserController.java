package com.dataSink.platform.controller;

import com.alibaba.fastjson.JSONObject;
import com.dataSink.platform.entity.User;
import com.dataSink.platform.service.UserService;
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

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get")
    @ResponseBody
    public User getUserByID(@RequestParam(value = "id",required = true)int id){
        System.out.println(JSONObject.toJSONString(userService.GetUserByID(id)));
        return userService.GetUserByID(id);
    }
}
