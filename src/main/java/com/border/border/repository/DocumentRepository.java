package com.border.border.repository;

import com.border.border.model.Document;
import com.border.border.model.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByTraveler(Traveler traveler);
}
