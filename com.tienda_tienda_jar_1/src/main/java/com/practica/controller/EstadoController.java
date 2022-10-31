
package com.practica.controller;

import com.practica.domain.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.practica.server.EstadoService;

@Controller
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("/estado/nuevo")
    public String nuevoEstado(Estado estado){
        return "modificarEstado";
    }
    
    @PostMapping("/estado/guardar")
    public String guardarEstado(Estado estado){
        estadoService.save(estado);
        return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{idEstado}")
    public String modificarEstado(Estado estado, Model model){
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarEstado (Estado estado){
        estadoService.delete(estado);
        return "eliminarEstado";
    }
}
