package com.ufps.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String actividad;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private String resultado;
    private Date fechaFin;

    // Otros campos y relaciones

    // Getters y Setters
}
