package com.ufps.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Participacion {

    private Date fecha;
    private String observacion;
    private String descripcion;

    @ManyToOne
    private Modalidad modalidadId;

    @ManyToOne
    private Producto_tipo productoTipoId;

    @ManyToOne
    private Proyecto proyecto;

    @ManyToOne
    private Evento evento;

    @ManyToOne
    private Integrante integrante;
}
