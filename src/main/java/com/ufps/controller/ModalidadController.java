package com.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufps.entity.Modalidad;
import com.ufps.service.ModalidadService;

@Controller
@RequestMapping("/modalidades")
public class ModalidadController {
    @Autowired
    private ModalidadService modalidadService;

    @GetMapping
    public String listarModalidades(Model model) {
        model.addAttribute("modalidades", modalidadService.listarModalidades());
        return "modalidades/lista";
    }

    @GetMapping("/{id}")
    public String obtenerModalidad(@PathVariable Long id, Model model) {
        model.addAttribute("modalidad", modalidadService.obtenerModalidad(id));
        return "modalidades/detalle";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("modalidad", new Modalidad());
        return "modalidades/formulario";
    }

    @PostMapping
    public String crearModalidad(@ModelAttribute Modalidad modalidad) {
        modalidadService.crearModalidad(modalidad);
        return "redirect:/modalidades";
    }

    @GetMapping("/{id}/editar")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        model.addAttribute("modalidad", modalidadService.obtenerModalidad(id));
        return "modalidades/formulario";
    }

    @PostMapping("/{id}")
    public String actualizarModalidad(@PathVariable Long id, @ModelAttribute Modalidad modalidad) {
        modalidadService.actualizarModalidad(id, modalidad);
        return "redirect:/modalidades";
    }

    @PostMapping("/{id}/eliminar")
    public String eliminarModalidad(@PathVariable Long id) {
        modalidadService.eliminarModalidad(id);
        return "redirect:/modalidades";
    }
}