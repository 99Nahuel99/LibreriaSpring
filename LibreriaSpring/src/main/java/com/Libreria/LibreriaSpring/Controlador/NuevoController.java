
package com.Libreria.LibreriaSpring.Controlador;

import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.servicio.AutorServicio;
import com.Libreria.LibreriaSpring.servicio.EditorialServicio;
import com.Libreria.LibreriaSpring.servicio.LibroServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class NuevoController {

    @Autowired
    private LibroServicio libroServicio;
    @Autowired
    private AutorServicio autorservicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @PostMapping("/guardar")

    public String guardar(ModelMap modo, @RequestParam(required=false) String titulo ,@RequestParam (required=false) Integer anio, @RequestParam(required=false) String nombre, @RequestParam (required=false) String apellido) {
        try {
            libroServicio.registrar(titulo, anio );
            autorservicio.agregarAutor(nombre, apellido);
            editorialServicio.agregarEditorial(nombre);
            modo.put("e", "Registro exitoso");
            return "CargarLibro.html";
        } catch (ErrorServicio ex) {
            Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
            modo.put("ero", ex.getMessage());
            return "CargarLibro.html";
        }

   }
    
    
    
    
    
    
    
    
    
    
//    
//     @GetMapping("/guardar")
//    public String guardar(){
//        return "CargarLibro";
//    }
//    

}