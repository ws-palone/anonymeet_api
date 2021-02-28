package com.example.anonymeet_api.services;

import com.example.anonymeet_api.models.Interest;
import com.example.anonymeet_api.repositories.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestService {
    private final InterestRepository interestRepository;

    @Autowired
    public InterestService(InterestRepository interestRepository) {
        this.interestRepository = interestRepository;
    }

    public List<Interest> getAllInterests(){
        return interestRepository.findAll();
    }
}
