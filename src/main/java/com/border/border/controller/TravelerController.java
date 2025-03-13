package com.border.border.controller;





import com.border.border.service.*;
import com.border.border.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/travelers")
public class TravelerController {
    @Autowired
    private TravelerService travelerService;

    @GetMapping
    public List<Traveler> getAllTravelers() {
        return travelerService.getAllTravelers();
    }

    @GetMapping("/{id}")
    public Optional<Traveler> getTravelerById(@PathVariable Long id) {
        return travelerService.getTravelerById(id);
    }

    @PostMapping
    public Traveler createTraveler(@RequestBody Traveler traveler) {
        return travelerService.saveTraveler(traveler);
    }

    @DeleteMapping("/{id}")
    public void deleteTraveler(@PathVariable Long id) {
        travelerService.deleteTraveler(id);
    }
}
