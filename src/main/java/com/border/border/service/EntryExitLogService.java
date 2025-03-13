package com.border.border.service;


import com.border.border.model.BorderCheckPoint;
import com.border.border.model.EntryExitLog;
import com.border.border.model.Traveler;
import com.border.border.repository.EntryExitLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EntryExitLogService {
    @Autowired
    private EntryExitLogRepository logRepository;

    public List<EntryExitLog> getAllLogs() {
        return logRepository.findAll();
    }

    public Optional<EntryExitLog> getLogById(Long id) {
        return logRepository.findById(id);
    }

    public List<EntryExitLog> getLogsByTraveler(Traveler traveler) {
        return logRepository.findByTraveler(traveler);
    }

    public List<EntryExitLog> getLogsByCheckpoint(BorderCheckPoint checkpoint) {
        return logRepository.findByCheckpoint(checkpoint);
    }

//    public EntryExitLog saveLog(EntryExitLog log) {
//        return logRepository.save(log);
//    }

    public void deleteLog(Long id) {
        logRepository.deleteById(id);
    }
}
