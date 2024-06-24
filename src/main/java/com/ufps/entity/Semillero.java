package com.ufps.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Semillero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    private Director director;

    @OneToMany(mappedBy = "semillero")
    private List<Integrante> integrantes;

    @OneToMany(mappedBy = "semillero")
    private List<Capacitacion> capacitaciones;

    // Getters y setters
}