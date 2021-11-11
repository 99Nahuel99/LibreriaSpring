/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Libreria.LibreriaSpring.Controlador;

import com.Libreria.LibreriaSpring.entidades.Autor;
import com.Libreria.LibreriaSpring.entidades.Editorial;
import com.Libreria.LibreriaSpring.entidades.Libro;
import com.Libreria.LibreriaSpring.servicio.AutorServicio;
import com.Libreria.LibreriaSpring.servicio.EditorialServicio;
import com.Libreria.LibreriaSpring.servicio.LibroServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Rodriguez
 */
//@Controller
//@RequestMapping("/")
//public class TablaNuevoCotroller {
//
//    @Autowired
//    private LibroServicio libroServicio;
//    @Autowired
//    private AutorServicio autorservicio;
//    @Autowired
//    private EditorialServicio editorialServicio;
//
//    @GetMapping("/tabla")
//    public String lista(ModelMap modelo) {
//        List<Libro> libroslista = libroServicio.listarLibros();
//        List<Autor> autorlista = autorservicio.listarAutores();
//        List<Editorial> editoriallista = editorialServicio.listarTodosE();
//        modelo.addAttribute("libros", "libroslista");
//               modelo.addAttribute("autor", "autorlista");
//                      modelo.addAttribute("editorial", "editoriallista");
//        return "list-libro";
//       
//    }
//
//}
