package com.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufps.entity.Integrante;
import com.ufps.service.IntegranteService;

@Controller
@RequestMapping("/integrantes")
public class IntegranteController {
    @Autowired
    private IntegranteService integranteService;

    @GetMapping("/{id}/editar")
    public String mostrarFormularioEdicion(@PathVariable Long id, Model model) {
        model.addAttribute("integrante", integranteService.obtenerIntegrantesPorSemillero(id));
        return "integrantes/formulario";
    }

    @PostMapping("/{id}")
    public String actualizarIntegrante(@PathVariable Long id, @ModelAttribute Integrante integrante) {
        integranteService.actualizarIntegrante(id, integrante);
        return "redirect:/integrantes";
    }

    @GetMapping("/semillero/{semilleroId}")
    public String listarIntegrantesPorSemillero(@PathVariable Long semilleroId, Model model) {
        model.addAttribute("integrantes", integranteService.obtenerIntegrantesPorSemillero(semilleroId));
        return "integrantes/lista";
    }
}