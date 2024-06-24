package com.ufps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entity.Actividad;
import com.ufps.repository.ActividadRepository;

@Service
public class ActividadService {
    @Autowired
    private ActividadRepository actividadRepository;

    public Actividad obtenerActividad(Long id) {
        return actividadRepository.findById(id)
                .orElseThrow();
    }
}