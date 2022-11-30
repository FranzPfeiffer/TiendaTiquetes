package com.tienda_tiquetes.controller;

import com.tienda_tiquetes.server.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private RutaService rutaService;

    @GetMapping("/")
    public String inicio(Model model) {

        var rutas = rutaService.getRuta();

        model.addAttribute("rutas", rutas);

        return "index";
    }
    
    @GetMapping("/contacto/contacto")
    public String contacto(Model model) {
        return "/contacto/contacto";
    }
    
    @GetMapping("/flota/flota")
    public String flota(Model model) {
        return "/flota/flota";
    }
    
    @GetMapping("/info/info")
    public String info(Model model) {
        return "/info/info";
    }
    
    @GetMapping("/compra/compra")
    public String compra(Model model) {
        return "/compra/compra";
    }
    
    @GetMapping("/cambio/cambio")
    public String cambio(Model model) {
        return "/cambio/cambio";
    }

}
