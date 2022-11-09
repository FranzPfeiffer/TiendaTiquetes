
package com.tienda_tiquetes.controller;

import com.tienda_tiquetes.domain.Ruta;
import com.tienda_tiquetes.dao.RutaDao;
import com.tienda_tiquetes.server.RutaService;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @Autowired
    private RutaService rutaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        /*var texto = "Estamos en semana 4";
        model.addAttribute("mensaje", texto);
        
        Cliente cliente1 = new Cliente("Juan", "Perez Moreno", "juanpemoreno@gmail.com", "22851018");
        Cliente cliente2 = new Cliente("Pedro", "Guillen Moreno", "pedroguillen@gmail.com", "83478856");
        Cliente cliente3 = new Cliente("Sofia", "Perez Vargas", "sofiperez@gmail.com", "64004347");
        
        var clientes = Arrays.asList(cliente1,cliente2,cliente3); */
        
        var rutas = rutaService.getRuta();
                
        model.addAttribute("rutas", rutas);
 
        return "index";
    }
}
