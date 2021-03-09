package com.example.anonymeet_api.loaders;

import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.repositories.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProfileLoader {

    @Bean
    CommandLineRunner clrProfile (ProfileRepository profileRepository){
        return args -> {
            Profile bot1 = new Profile("bot1@gmail.com", "bot1", 22, "M", "Moto", "Cuisine", "Politique");
            Profile bot2 = new Profile("bot2@gmail.com", "bot2", 44, "M", "Mode", "Sport", "Cinéma");
            Profile bot3 = new Profile("bot3@gmail.com", "bot3", 20, "F", "Danse", "Cuisine", "Netflix");

            profileRepository.saveAll(
                    List.of(bot1, bot2, bot3)
            );
        };
    }
}
