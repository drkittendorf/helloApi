package com.helloapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
public class HelloController {

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String sayHello() {
        return "hello heroku";
    }

    @RequestMapping(value="/hi/{name}", method= RequestMethod.GET)
    public String helloHeroku(@PathVariable String name){
        return "Whats happening" + name;

    }


}