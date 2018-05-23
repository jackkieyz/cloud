package com.stone.service.demo.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Stone
 * Date: 2018-05-23
 * Time: 17:07
 * Description:
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${test.name}")
    private String name;

    @RequestMapping("/test/name")
    public String getName() {
        return name;
    }
}
