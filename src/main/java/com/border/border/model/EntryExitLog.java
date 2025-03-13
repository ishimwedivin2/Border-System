package com.border.border.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "entryexitlog")
public class EntryExitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "traveler_id", nullable = false)
    private Traveler traveler;

    @ManyToOne
    @JoinColumn(name = "checkpoint_id", nullable = false)
    private BorderCheckPoint checkpoint;

    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    private String status; // Approved, Denied, Pending

}
