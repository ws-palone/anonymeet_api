package com.example.anonymeet_api.loaders;

import com.example.anonymeet_api.models.Interest;
import com.example.anonymeet_api.repositories.InterestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InterestLoader {

    @Bean
    CommandLineRunner commandLineRunner (InterestRepository interestRepository){
        return args -> {
            Interest cinema = new Interest("Cinéma");
            Interest sport = new Interest("Sport");
            Interest festival = new Interest("Festival");
            Interest moto = new Interest("Moto");
            Interest jeuxVideos = new Interest("Jeux Vidéos");
            Interest informatique = new Interest("Informatique");
            Interest litterature = new Interest("Littérature");
            Interest netflix = new Interest("Netflix");
            Interest art = new Interest("Art");
            Interest mode = new Interest("Mode");
            Interest bricolage = new Interest("Bricolage");
            Interest vin = new Interest("Vin");
            Interest danse = new Interest("Danse");
            Interest cuisine = new Interest("Cuisine");
            Interest photographie = new Interest("Photographie");
            Interest musee = new Interest("Musée");
            Interest voyage = new Interest("Voyage");
            Interest mecanique = new Interest("Mécanique");
            Interest tatouages = new Interest("Tatouages");
            Interest politique = new Interest("Politique");

            interestRepository.saveAll(
                    List.of(cinema, sport, festival, moto, jeuxVideos, informatique, litterature, netflix, art, mode, bricolage, vin, danse, cuisine, photographie, musee, voyage, mecanique, tatouages, politique)
            );
        };
    }
}
