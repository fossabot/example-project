package com.mskj.buildpack.sample.java.maven.jar.demoapp.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello world!";
    }

}
