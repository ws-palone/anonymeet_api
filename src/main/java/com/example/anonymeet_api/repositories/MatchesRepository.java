package com.example.anonymeet_api.repositories;

import com.example.anonymeet_api.models.Matches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchesRepository extends JpaRepository<Matches, Long> {

    @Query(value=
            "SELECT match_id FROM matches WHERE profile_id = ?1"
            , nativeQuery = true)
    public List<Long> findMatchesById(Long id);

}
