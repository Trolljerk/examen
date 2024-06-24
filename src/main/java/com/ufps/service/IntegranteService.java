package com.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.entity.Integrante;
import com.ufps.repository.IntegranteRepository;

@Service
public class IntegranteService {
    @Autowired
    private IntegranteRepository integranteRepository;

    public Integrante actualizarIntegrante(Long id, Integrante integrante) {
        Integrante integranteExistente = integranteRepository.findById(id)
                .orElseThrow();

        integranteExistente.setNombre(integrante.getNombre());
        integranteExistente.setApellido(integrante.getApellido());
        integranteExistente.setSemillero(integrante.getSemillero());
        integranteExistente.setRol(integrante.getRol());

        return integranteRepository.save(integranteExistente);
    }

    public List<Integrante> obtenerIntegrantesPorSemillero(Long semilleroId) {
        return integranteRepository.findBySemilleroId(semilleroId);
    }
}