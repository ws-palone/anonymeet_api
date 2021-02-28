package com.example.anonymeet_api.controllers;

import com.example.anonymeet_api.models.Interest;
import com.example.anonymeet_api.services.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/interest")
public class InterestController {

    private final InterestService interestService;

    @Autowired
    public InterestController(InterestService interestService) {
        this.interestService = interestService;
    }

    @GetMapping("/getAll")
    public List<Interest> getAllInterests(){
        return interestService.getAllInterests();
    }
}
