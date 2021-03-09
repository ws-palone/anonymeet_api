package com.example.anonymeet_api.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "Message")
@Table
public class Message {

    @Id
    @SequenceGenerator(
            name = "message_sequence",
            sequenceName = "message_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "message_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "sender_id",
            updatable = false
    )
    private Long sender_id;

    @Column(
            name = "receiver_id",
            updatable = false
    )
    private Long receiver_id;

    @Column(
            name = "message_content",
            nullable = false,
            length = 3000
    )
    private String messageContent;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(
            name = "date",
            updatable = false
    )
    private Date date;

    public Message() {
    }

    public Message(String messageContent, Long receiver_id, Long sender_id) {

        this.messageContent = messageContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSender_id() {
        return sender_id;
    }

    public void setSender_id(Long sender_id) {
        this.sender_id = sender_id;
    }

    public Long getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(Long receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getMessage() {
        return messageContent;
    }

    public void setMessage(String message) {
        this.messageContent = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
