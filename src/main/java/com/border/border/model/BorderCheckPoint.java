package com.border.border.model;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "bordercheckpoint")
public class BorderCheckPoint {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String type; // e.g. like "Land", "Air", "Sea"



}
