package com.border.border.service;



import com.border.border.model.*;
import com.border.border.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BorderCheckPointService {
    @Autowired
    private BorderCheckPointRepository checkpointRepository;

    public List<BorderCheckPoint> getAllCheckpoints() {
        return checkpointRepository.findAll();
    }

    public Optional<BorderCheckPoint> getCheckpointById(Long id) {
        return checkpointRepository.findById(id);
    }

    public BorderCheckPoint getCheckpointByName(String name) {
        return checkpointRepository.findByName(name);
    }

    public BorderCheckPoint saveCheckpoint(BorderCheckPoint checkpoint) {
        return checkpointRepository.save(checkpoint);
    }

    public void deleteCheckpoint(Long id) {
        checkpointRepository.deleteById(id);
    }
}
