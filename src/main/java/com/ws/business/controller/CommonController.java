package com.ws.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by bbtree on 2017/2/16.
 */
@Controller
@RequestMapping("/common")
public class CommonController {

    @RequestMapping("/test")
    @ResponseBody
    public String testInterface(){
        return "index";
    }
}
