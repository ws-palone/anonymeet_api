package com.example.anonymeet_api.controllers;

import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.repositories.ProfileRepository;
import com.example.anonymeet_api.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/profile")
public class ProfileController {

    private final ProfileService profileService;

    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileController(ProfileService profileService, ProfileRepository profileRepository) {
        this.profileService = profileService;
        this.profileRepository = profileRepository;
    }

    //@GET MAPPING
    @GetMapping("/getAll")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }

    //@POST MAPPING
    @PostMapping(path = "/saveProfile")
    public ResponseEntity<String> saveProfile(@RequestBody Profile profile){
        profileRepository.save(profile);
        return new ResponseEntity<>("Profile " + profile.getPseudo() + " successfully saved. ", HttpStatus.OK);
    }

}
