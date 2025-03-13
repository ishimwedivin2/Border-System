package com.border.border.service;




import com.border.border.model.*;
import com.border.border.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomsDeclarationService {
    @Autowired
    private CustomsDeclarationRepository declarationRepository;

    public List<CustomsDeclaration> getAllDeclarations() {
        return declarationRepository.findAll();
    }

    public Optional<CustomsDeclaration> getDeclarationById(Long id) {
        return declarationRepository.findById(id);
    }

    public List<CustomsDeclaration> getDeclarationsByTraveler(Traveler traveler) {
        return declarationRepository.findByTraveler(traveler);
    }

    public CustomsDeclaration saveDeclaration(CustomsDeclaration declaration) {
        return declarationRepository.save(declaration);
    }

    public void deleteDeclaration(Long id) {
        declarationRepository.deleteById(id);
    }
}
