package com.example.anonymeet_api.controllers;

import com.example.anonymeet_api.models.Message;
import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/message")
public class MessageController {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    //@GET MAPPING
    @GetMapping("/findMessageById/{sender_id}/{receiver_id}")
    public List<Message> getMatchesById(@PathVariable Long sender_id, @PathVariable Long receiver_id){
        return messageRepository.findMessageById(sender_id, receiver_id);
    }

    //@POST MAPPING
    @PostMapping(path = "/saveMessage")
    public ResponseEntity<String> saveMessage(@RequestBody Message message){
        messageRepository.save(message);
        return new ResponseEntity<>("Message successfully send.", HttpStatus.OK);
    }
}
