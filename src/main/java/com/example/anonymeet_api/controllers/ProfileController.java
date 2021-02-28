package com.example.anonymeet_api.controllers;

import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/profile")
public class ProfileController {

    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/getAll")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }
}
