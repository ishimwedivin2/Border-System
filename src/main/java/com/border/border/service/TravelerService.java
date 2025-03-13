package com.border.border.service;



import com.border.border.model.*;
import com.border.border.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TravelerService {
    @Autowired
    private TravelerRepository travelerRepository;

    public List<Traveler> getAllTravelers() {
        return travelerRepository.findAll();
    }

    public Optional<Traveler> getTravelerById(Long id) {
        return travelerRepository.findById(id);
    }

    public Traveler getTravelerByPassport(String passportNumber) {
        return travelerRepository.findByPassportNumber(passportNumber);
    }

    public Traveler saveTraveler(Traveler traveler) {
        return travelerRepository.save(traveler);
    }

    public void deleteTraveler(Long id) {
        travelerRepository.deleteById(id);
    }
}
