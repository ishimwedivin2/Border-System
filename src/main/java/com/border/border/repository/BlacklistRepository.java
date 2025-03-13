package com.border.border.repository;

import com.border.border.model.Blacklist;
import com.border.border.model.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlacklistRepository extends JpaRepository<Blacklist, Long> {

    Blacklist findByTraveler(Traveler traveler);

}
