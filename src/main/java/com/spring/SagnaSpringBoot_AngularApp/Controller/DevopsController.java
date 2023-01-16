package com.spring.SagnaSpringBoot_AngularApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
    @RequestMapping("/Hello")

    public String SayHello() {
        return "Hello world";
    }
}