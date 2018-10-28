package com.dataSink.platform.controller;

import com.dataSink.platform.App;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huanglijun on 2018/10/29.
 */
@Controller
public class HealthController {

    private static Logger logger= Logger.getLogger(HealthController.class);

    @RequestMapping(value = "/hs")
    @ResponseBody
    public String check(){
        logger.info("check ok");
        return "ok";
    }
}
