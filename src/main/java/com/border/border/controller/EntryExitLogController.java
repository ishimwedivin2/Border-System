package com.border.border.controller;




import com.border.border.model.*;
import com.border.border.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logs")
public class EntryExitLogController {
    @Autowired
    private EntryExitLogService logService;

    @GetMapping
    public List<EntryExitLog> getAllLogs() {
        return logService.getAllLogs();
    }

    @GetMapping("/{id}")
    public Optional<EntryExitLog> getLogById(@PathVariable Long id) {
        return logService.getLogById(id);
    }

//    @PostMapping
//    public EntryExitLog createLog(@RequestBody EntryExitLog log) {
//        return logService.saveLog(log);
//    }

    @DeleteMapping("/{id}")
    public void deleteLog(@PathVariable Long id) {
        logService.deleteLog(id);
    }
}
