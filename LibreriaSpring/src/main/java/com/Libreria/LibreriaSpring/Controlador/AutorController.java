/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Libreria.LibreriaSpring.Controlador;

import com.Libreria.LibreriaSpring.entidades.Autor;
import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.servicio.AutorServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rodriguez
 */
//@Controller
//@RequestMapping("/autor")
//public class AutorController {
//       @Autowired
//    private AutorServicio autorservicio;
//          
//       
//       @GetMapping("/lista")
//    public String lista(ModelMap modelo){
//        List<Autor> autores = autorservicio.listarAutores();
//        modelo.addAttribute("autores", autores);
//        return "listaAutores.html";
//    }
//   
//      @PostMapping("/guardar")
//    public String guardar(ModelMap model,@RequestParam String nombre, @RequestParam String apellido) {
//        try {
//            autorservicio.agregarAutor(nombre, apellido);
//        model.put("exitos","Regstro exitoso");
//          
//        } catch (ErrorServicio ex) {
//            Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
//             model.put("errores"," Falto algun dato");
//            return "CargarLibro.html";
//        }
//      return "CargarLibro.html";
//    }
//    
//    
//}
