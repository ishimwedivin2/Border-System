package com.border.border.controller;





import com.border.border.model.*;
import com.border.border.service.*;
import com.border.border.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/checkpoints")
public class BorderCheckPointController {
    @Autowired
    private BorderCheckPointService checkpointService;

    @GetMapping
    public List<BorderCheckPoint> getAllCheckpoints() {
        return checkpointService.getAllCheckpoints();
    }

    @GetMapping("/{id}")
    public Optional<BorderCheckPoint> getCheckpointById(@PathVariable Long id) {
        return checkpointService.getCheckpointById(id);
    }

    @PostMapping
    public BorderCheckPoint createCheckpoint(@RequestBody BorderCheckPoint checkpoint) {
        return checkpointService.saveCheckpoint(checkpoint);
    }

    @DeleteMapping("/{id}")
    public void deleteCheckpoint(@PathVariable Long id) {
        checkpointService.deleteCheckpoint(id);
    }
}
