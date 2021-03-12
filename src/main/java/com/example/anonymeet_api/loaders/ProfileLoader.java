package com.example.anonymeet_api.loaders;

import com.example.anonymeet_api.models.Profile;
import com.example.anonymeet_api.repositories.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Configuration
public class ProfileLoader {

    String sDate1="1998-03-21";
    Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);

    String sDate2="1996-06-03";
    Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate2);

    String sDate3="2001-07-04";
    Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate3);

    public ProfileLoader() throws ParseException {
    }

    @Bean
    CommandLineRunner clrProfile (ProfileRepository profileRepository){
        return args -> {
            Profile bot1 = new Profile("bot1@gmail.com", "bot1", date1, "M", "F", null, "Moto", "Cuisine", "Politique",-122.078181, 37.419967);
            Profile bot2 = new Profile("bot2@gmail.com", "bot2", date2, "M", "F", null,  "Mode", "Sport", "Cinéma", -122.088377, 37.421383);
            Profile bot3 = new Profile("bot3@gmail.com", "bot3", date3, "F", "M", null, "Danse", "Cuisine", "Netflix", -122.097396,37.427882);

            profileRepository.saveAll(
                    List.of(bot1, bot2, bot3)
            );
        };
    }
}
