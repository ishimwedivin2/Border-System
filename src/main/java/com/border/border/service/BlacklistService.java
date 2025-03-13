package com.border.border.service;



import com.border.border.model.*;
import com.border.border.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BlacklistService {
    @Autowired
    private BlacklistRepository blacklistRepository;

    public List<Blacklist> getAllBlacklists() {
        return blacklistRepository.findAll();
    }

    public Optional<Blacklist> getBlacklistById(Long id) {
        return blacklistRepository.findById(id);
    }

    public Blacklist getBlacklistByTraveler(Traveler traveler) {
        return blacklistRepository.findByTraveler(traveler);
    }

    public Blacklist saveBlacklist(Blacklist blacklist) {
        return blacklistRepository.save(blacklist);
    }

    public void deleteBlacklist(Long id) {
        blacklistRepository.deleteById(id);
    }
}
