package com.yoghurt.controller;

import com.yoghurt.Exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by admin on 2017/6/22.
 */
@ApiIgnore
@Controller
public class HelpController {

    @RequestMapping(value = "/hello")
    public String hello() throws Exception {
        throw new MyException("发生错误");
    }

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}