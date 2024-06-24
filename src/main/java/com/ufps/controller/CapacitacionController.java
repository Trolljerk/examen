package com.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufps.service.CapacitacionService;

@Controller
@RequestMapping("/capacitaciones")
public class CapacitacionController {
    @Autowired
    private CapacitacionService capacitacionService;

    @PostMapping("/{id}/eliminar")
    public String eliminarCapacitacion(@PathVariable Long id) {
        capacitacionService.eliminarCapacitacion(id);
        return "redirect:/capacitaciones";
    }
}