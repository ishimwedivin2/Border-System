package com.border.border.repository;

import com.border.border.model.CustomsDeclaration;
import com.border.border.model.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomsDeclarationRepository extends JpaRepository<CustomsDeclaration, Long> {

    List<CustomsDeclaration> findByTraveler(Traveler traveler);

}
