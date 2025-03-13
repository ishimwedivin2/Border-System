package com.border.border.repository;

import com.border.border.model.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelerRepository extends JpaRepository<Traveler, Long> {

    Traveler findByPassportNumber(String passportNumber);

}
