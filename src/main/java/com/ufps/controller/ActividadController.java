package com.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufps.service.ActividadService;

@Controller
@RequestMapping("/actividades")
public class ActividadController {
    @Autowired
    private ActividadService actividadService;

    @GetMapping("/{id}")
    public String obtenerActividad(@PathVariable Long id, Model model) {
        model.addAttribute("actividad", actividadService.obtenerActividad(id));
        return "actividades/detalle";
    }
}