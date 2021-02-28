package com.example.anonymeet_api.services;

import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    @Autowired
    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public List<Profile> getAllProfiles(){
        return profileRepository.findAll();
    }
}
