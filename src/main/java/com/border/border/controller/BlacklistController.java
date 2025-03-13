package com.border.border.controller;




import com.border.border.model.*;
import  com.border.border.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blacklists")
public class BlacklistController {
    @Autowired
    private BlacklistService blacklistService;

    @GetMapping
    public List<Blacklist> getAllBlacklists() {
        return blacklistService.getAllBlacklists();
    }

    @GetMapping("/{id}")
    public Optional<Blacklist> getBlacklistById(@PathVariable Long id) {
        return blacklistService.getBlacklistById(id);
    }

    @PostMapping
    public Blacklist createBlacklist(@RequestBody Blacklist blacklist) {
        return blacklistService.saveBlacklist(blacklist);
    }

    @DeleteMapping("/{id}")
    public void deleteBlacklist(@PathVariable Long id) {
        blacklistService.deleteBlacklist(id);
    }
}
