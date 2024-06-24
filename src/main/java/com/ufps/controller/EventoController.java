package com.ufps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ufps.entity.Evento;
import com.ufps.service.EventoService;

@Controller
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping("/nuevo")
    public String mostrarFormularioCreacion(Model model) {
        model.addAttribute("evento", new Evento());
        return "eventos/formulario";
    }

    @PostMapping
    public String crearEvento(@ModelAttribute Evento evento) {
        eventoService.crearEvento(evento);
        return "redirect:/eventos";
    }
}
