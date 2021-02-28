package com.example.anonymeet_api.repositories;

import com.example.anonymeet_api.models.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Long> {
}
