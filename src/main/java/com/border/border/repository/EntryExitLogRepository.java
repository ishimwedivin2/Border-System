package com.border.border.repository;

import com.border.border.model.*;
import com.border.border.model.Traveler;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntryExitLogRepository extends JpaRepository<EntryExitLog, Long> {

    // Optional: Query to find logs by traveler or checkpoint
    List<EntryExitLog> findByTraveler(Traveler traveler);
    List<EntryExitLog> findByCheckpoint(BorderCheckPoint checkpoint);

}
