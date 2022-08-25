package com.demo.springbootdocker.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController@RequestMapping("/rest/docker/hello")
public class HelloResource {
    @GetMapping
    public String getMessage(){
        return "docker working";
    }
}
