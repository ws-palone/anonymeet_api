package com.example.anonymeet_api.loaders;

import com.example.anonymeet_api.models.Message;
import com.example.anonymeet_api.repositories.MessageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class MessageLoader {

    @Bean
    CommandLineRunner clrMessage (MessageRepository messageRepository){
        return args -> {
            Message message1 = new Message("hello", 2L, 1L);
            Message message2 = new Message("How are u doing ? :)", 2L, 1L);
            Message message3 = new Message("Fine and u ?", 1L, 2L);
            messageRepository.saveAll(
                    List.of(message1, message2, message3)
            );
        };
    }
}
