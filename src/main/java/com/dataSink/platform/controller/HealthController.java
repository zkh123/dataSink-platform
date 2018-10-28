package com.dataSink.platform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by huanglijun on 2018/10/29.
 */
@Controller
public class HealthController {

    @RequestMapping(value = "/hs")
    @ResponseBody
    public String check(){
        return "ok";
    }
}
