
package com.practica.controller;

import com.practica.domain.Estado;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.practica.dao.EstadoDao;
import com.practica.server.EstadoService;

@Controller
public class IndexController {
    
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var estados = estadoService.getEstado();
                
        model.addAttribute("estados", estados);
 
        return "index";
    }
}
    