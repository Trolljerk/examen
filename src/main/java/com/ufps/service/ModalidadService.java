package com.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entity.Modalidad;
import com.ufps.repository.ModalidadRepository;

@Service
public class ModalidadService {
    @Autowired
    private ModalidadRepository modalidadRepository;

    public List<Modalidad> listarModalidades() {
        return modalidadRepository.findAll();
    }

    public Modalidad obtenerModalidad(Long id) {
        return modalidadRepository.findById(id)
                .orElseThrow();
    }

    public Modalidad crearModalidad(Modalidad modalidad) {
        return modalidadRepository.save(modalidad);
    }

    public Modalidad actualizarModalidad(Long id, Modalidad modalidad) {
        Modalidad modalidadExistente = modalidadRepository.findById(id)
                .orElseThrow();

        modalidadExistente.setDescripcion(modalidad.getDescripcion());

        return modalidadRepository.save(modalidadExistente);
    }

    public void eliminarModalidad(Long id) {
        modalidadRepository.deleteById(id);
    }
}