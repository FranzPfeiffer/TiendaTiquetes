
package com.tienda_tiquetes.controller;

import com.tienda_tiquetes.domain.Ruta;
import com.tienda_tiquetes.server.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RutaController {
    
    @Autowired
    private RutaService rutaService;
    
    @GetMapping("/ruta/nueva")
    public String nuevaRuta(Ruta ruta){
        return "modificarRuta";
    }
    
    @PostMapping("/ruta/guardar")
    public String guardarRuta(Ruta ruta){
        rutaService.save(ruta);
        return "redirect:/ruta/listado";
    }
    
    @GetMapping("/ruta/modificar/{idRuta}")
    public String modificarRuta(Ruta ruta, Model model){
        ruta = rutaService.getRuta(ruta);
        model.addAttribute("ruta", ruta);
        return "modificarRuta";
    }
    
    @GetMapping("/ruta/eliminar/{idRuta}")
    public String eliminarRuta(Ruta ruta){
        rutaService.delete(ruta);
        return "eliminarRuta";
    }
}
