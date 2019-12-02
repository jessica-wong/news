package com.amazing.news.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类功能说明
 *
 * @author lijuan.wong@xiaobao100.com
 * @date 2019/12/2
 */
@Controller
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public Object helloWorld(){
        return "Hello world!";
    }
}
