/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Libreria.LibreriaSpring.Controlador;

import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.servicio.EditorialServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rodriguez
 */
//@Controller
//@RequestMapping("/")
//public class EditorialController {
//        @Autowired
//    private EditorialServicio editorialServicio;
//        
//           @PostMapping("/llenar")
//    public String llenar(ModelMap mo,@RequestParam String nombre) {
//        try {
//            editorialServicio.agregarEditorial(nombre);
//            mo.put("ex","Registro exitoso");
//            return "CargarLibro.html";
//        } catch (ErrorServicio ex) {
//            Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
//            mo.put("er"," Falto algun dato");
//            return "CargarLibro.html";
//        }
//
//        
//    }
//    
//}
