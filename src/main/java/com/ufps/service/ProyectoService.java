package com.ufps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ufps.entity.Proyecto;
import com.ufps.repository.ProyectoRepository;

public class ProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    public List<Proyecto> listarProyectos() {
        return proyectoRepository.findAll();
    }
}
