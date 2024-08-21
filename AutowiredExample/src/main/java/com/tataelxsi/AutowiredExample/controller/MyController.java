package com.tataelxsi.AutowiredExample.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tataelxsi.AutowiredExample.service.MyService;

@Controller
public class MyController {
	@Autowired
    private MyService service;
 
    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Hello from Spring MVC!";
    }
 
    @GetMapping("/service")
    @ResponseBody
    public String service() {
        return service.getServiceMessage();
    }
}