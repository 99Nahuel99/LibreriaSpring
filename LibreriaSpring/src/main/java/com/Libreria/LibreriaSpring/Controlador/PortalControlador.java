package com.Libreria.LibreriaSpring.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {

    @GetMapping("/")
    public String PaginaPrincipal() {
        return "PaginaPrincipal.html";
    }
    
    @GetMapping("/CargarLibro")
    public String CargarLibro() {
        return "CargarLibro.html";
    }
    
    @GetMapping("/PaneldeLibro")
    public String PaneldeLibro(){
        return "PaneldeLibro.html";
    }
}
