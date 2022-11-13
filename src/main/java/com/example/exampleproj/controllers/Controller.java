package com.example.exampleproj.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class Controller {

    @GetMapping(path = "/some")
    public String getSome() {
        return "Hello World!!!";
    }
}
