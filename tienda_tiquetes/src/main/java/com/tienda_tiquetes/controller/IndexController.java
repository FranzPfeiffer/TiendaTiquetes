package com.tienda_tiquetes.controller;

import com.tienda_tiquetes.domain.Tiquete;
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

    @GetMapping("/tiquete/nuevo")
    public String nuevoTiquete(Tiquete Tiquete) {
        return "modificarTiquete";
    }
    
    @GetMapping("/tiquete/listado")
    public String listado(Model model) {
        return "/tiquete/listado";
    }
    
    @GetMapping("/contacto/factura")
    public String factura(Model model) {
        return "/compra/factura";
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

    @GetMapping("/compra/ruta1")
    public String ruta1(Model model) {
        return "/compra/ruta1";
    }

    @GetMapping("/compra/ruta2")
    public String ruta2(Model model) {
        return "/compra/ruta2";
    }

    @GetMapping("/compra/ruta3")
    public String ruta3(Model model) {
        return "/compra/ruta3";
    }

    @GetMapping("/cambio/cambio")
    public String cambio(Model model) {
        return "/cambio/cambio";
    }

}
