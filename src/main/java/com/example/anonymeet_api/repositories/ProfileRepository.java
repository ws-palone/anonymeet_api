package com.example.anonymeet_api.repositories;

import com.example.anonymeet_api.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    @Query(value=
            "SELECT * FROM profile WHERE id = ?1"
            , nativeQuery = true)
    public Profile findProfileById(Long id);

    @Query(value=
            "SELECT * FROM profile WHERE email = ?1"
            , nativeQuery = true)
    public Profile findProfileByEmail(String email);

    @Query(value=
            "SELECT id FROM profile WHERE email = ?1"
            , nativeQuery = true)
    public Long findIdByEmail(String email);

}
