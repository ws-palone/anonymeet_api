package com.example.anonymeet_api.repositories;

import com.example.anonymeet_api.models.Message;
import com.example.anonymeet_api.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

    @Query(value=
            "SELECT * FROM message WHERE (sender_id = ?1" +
                    " AND receiver_id = ?2) OR (sender_id = ?2 AND receiver_id = ?1)"
            , nativeQuery = true)
    public List<Message> findMessageById(Long sender_id, Long receiver_id);

}
