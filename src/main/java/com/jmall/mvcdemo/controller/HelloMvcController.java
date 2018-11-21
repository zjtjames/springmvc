/**
 * created by Zheng Jiateng on 2018/11/21.
 */
package com.jmall.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 拦截根目录下的hello
@RequestMapping("/hello")
public class HelloMvcController {

    // host:8080/hello/mvc
    @RequestMapping("/mvc")
    public String helloMvc() {
        return "home";
    }
}
