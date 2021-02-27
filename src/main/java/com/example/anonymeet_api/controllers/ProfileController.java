package com.example.anonymeet_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "anonymeet_api/profile")
public class ProfileController {

    @GetMapping
    public String hello(){
        return "Hello";
    }
}
