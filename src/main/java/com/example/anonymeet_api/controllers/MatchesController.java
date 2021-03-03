package com.example.anonymeet_api.controllers;

import com.example.anonymeet_api.models.Matches;
import com.example.anonymeet_api.repositories.MatchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/match")
public class MatchesController {

    private final MatchesRepository matchesRepository;

    @Autowired
    public MatchesController(MatchesRepository matchesRepository) {
        this.matchesRepository = matchesRepository;
    }

    //@GET MAPPING
    @GetMapping("/findMatchesById/{id}")
    public List<Long> getMatchesById(@PathVariable Long id){
        return matchesRepository.findMatchesById(id);
    }

    //@POST MAPPING
    @PostMapping(path = "/saveMatch")
    public ResponseEntity<String> saveProfile(@RequestBody Matches matches){
        matchesRepository.save(matches);
        return new ResponseEntity<>("Match successfully saved. ", HttpStatus.OK);
    }

}
