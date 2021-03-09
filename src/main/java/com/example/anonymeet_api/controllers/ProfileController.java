package com.example.anonymeet_api.controllers;

import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.repositories.ProfileRepository;
import com.example.anonymeet_api.services.ProfileService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.PropertyAccessor;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/findProfileById/{id}")
    public Profile getProfileByEmail(@PathVariable Long id){
        return profileRepository.findProfileById(id);
    }

    @GetMapping("/findProfileByEmail/{email}")
    public Profile getProfileByEmail(@PathVariable String email){
        return profileRepository.findProfileByEmail(email);
    }

    @GetMapping("/findIdByEmail/{email}")
    public Long getIdByEmail(@PathVariable String email){
        return profileRepository.findIdByEmail(email);
    }

    //@POST MAPPING
    @PostMapping(path = "/saveProfile")
    public ResponseEntity<String> saveProfile(@RequestBody Profile profile){
        profileRepository.save(profile);
        return new ResponseEntity<>("Profile " + profile.getPseudo() + " successfully saved. ", HttpStatus.OK);
    }

    //@PUT MAPPING
    @PutMapping(value = "/updateProfile")
    public ResponseEntity<String> updateProfile(
            @RequestParam(required=false) Map<String,String> allParams,
            @RequestParam Long id
    ) throws JsonProcessingException {
        Profile profile;

        profile = profileRepository.findProfileById(id);

        System.out.println("Profile updated : " + profile.getId());

        for (String key : allParams.keySet()) {
            if (key.matches("latitude") || key.matches("longitude")) {
                PropertyAccessor myAccessor = PropertyAccessorFactory.forDirectFieldAccess(profile);
                myAccessor.setPropertyValue(key, allParams.get(key));
            }
        }

        profileRepository.save(profile);

        return new ResponseEntity<>("Profile n°" + id + " has been updated",HttpStatus.OK);
    }

}
