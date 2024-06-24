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
public class Integrante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @ManyToOne
    private Semillero semillero;

    @ManyToOne
    private Estudiante estudiante;

    @ManyToOne
    private Rol rol;

    @OneToMany(mappedBy = "integrante")
    private List<Participacion> participacion;

    @OneToMany(mappedBy = "integrante")
    private List<Actividad> actividad;

    @OneToMany(mappedBy = "integrante")
    private List<Proyecto> proyecto;

    @OneToMany(mappedBy = "integrante")
    private List<Capacitacion> capacitacion;

    @OneToMany(mappedBy = "integrante")
    private List<Inscrito> inscrito;

    // Getters y setters
}