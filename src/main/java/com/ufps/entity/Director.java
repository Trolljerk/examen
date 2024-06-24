package com.ufps.entity;

import java.sql.Date;
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
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nombre;
    private String identificacion;
    private String cvlac;
    private String direccion;
    private String telefono;
    private String email;
    private Date fechaNacimiento;

    @OneToMany(mappedBy = "director")
    private List<Semillero> semillero;

    @ManyToOne
    private Departamento departamento;

    @ManyToOne
    private NivelFormacion nivelFormacion;
}
