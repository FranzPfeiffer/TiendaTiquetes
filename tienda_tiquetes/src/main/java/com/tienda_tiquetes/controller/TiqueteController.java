package com.tienda_tiquetes.controller;

import com.tienda_tiquetes.domain.Tiquete;
import com.tienda_tiquetes.server.TiqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TiqueteController {

    @Autowired
    private TiqueteService tiqueteService;

    @GetMapping("/tiquete/nueva")
    public String nuevaTiquete(Tiquete tiquete) {
        return "modificarTiquete";
    }

    @PostMapping("/tiquete/guardar")
    public String guardarTiquete(Tiquete tiquete) {
        tiqueteService.save(tiquete);
        return "redirect:/tiquete/listado";
    }

    @GetMapping("/tiquete/modificar/{idTiquete}")
    public String modificarTiquete(Tiquete tiquete, Model model) {
        tiquete = tiqueteService.getTiquete(tiquete);
        model.addAttribute("tiquete", tiquete);
        return "modificarTiquete";
    }

    @GetMapping("/tiquete/eliminar/{idTiquete}")
    public String eliminarTiquete(Tiquete tiquete) {
        tiqueteService.delete(tiquete);
        return "eliminarTiquete";
    }
}
