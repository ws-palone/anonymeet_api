package com.example.anonymeet_api.loaders;

import com.example.anonymeet_api.models.Message;
import com.example.anonymeet_api.repositories.MessageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MessageLoader {

    String sDate1="2021-03-10 18:06:12.000000";
    @Temporal(TemporalType.TIMESTAMP)
    Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").parse(sDate1);

    String sDate2="2021-03-11 18:06:12.000000";
    @Temporal(TemporalType.TIMESTAMP)
    Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").parse(sDate2);

    String sDate3="2021-03-11 18:07:12.000000";
    @Temporal(TemporalType.TIMESTAMP)
    Date date3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").parse(sDate3);

    public MessageLoader() throws ParseException {
    }

    @Bean
    CommandLineRunner clrMessage (MessageRepository messageRepository){
        return args -> {
            Message message1 = new Message(date1,"hello", 2L, 1L);
            Message message2 = new Message(date2,"How are u doing ? :)", 2L, 1L);
            Message message3 = new Message(date3,"Fine and u ?", 1L, 2L);
            messageRepository.saveAll(
                    List.of(message1, message2, message3)
            );
        };
    }
}
