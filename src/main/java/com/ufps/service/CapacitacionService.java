package com.ufps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.repository.CapacitacionRepository;

@Service
public class CapacitacionService {
    @Autowired
    private CapacitacionRepository capacitacionRepository;

    public void eliminarCapacitacion(Long id) {
        capacitacionRepository.deleteById(id);
    }
}