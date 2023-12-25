package com.nbb.shenyu.springbootclient;

import org.apache.shenyu.client.springmvc.annotation.ShenyuSpringMvcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ShenyuSpringMvcClient("/test/**") // 该注解修饰的接口会被注册到shenyu-admin
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String echo(String string) {
        return port;
    }
}
