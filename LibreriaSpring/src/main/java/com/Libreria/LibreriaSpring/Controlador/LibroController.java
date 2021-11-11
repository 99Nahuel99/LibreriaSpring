

import com.Libreria.LibreriaSpring.Controlador.PortalControlador;
import com.Libreria.LibreriaSpring.entidades.Libro;
import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.servicio.LibroServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rodriguez
 */
//@Controller
//@RequestMapping("/PaneldeLibro")
//public class LibroController {
//      @Autowired
//   private LibroServicio libroServicio;
//    
//         
//        @PostMapping("/gurardar2")
//     public String guardar2(ModelMap modelo,@RequestParam String titulo,@RequestParam int anio) {
//        try {
//            libroServicio.registrar(titulo, anio);
//            modelo.put("exito","Registro exitoso");
//              return "CargarLibro.html";
//        } catch (ErrorServicio ex) {
//            Logger.getLogger(PortalControlador.class.getName()).log(Level.SEVERE, null, ex);
//            modelo.put("error"," Falto algun dato");
//            return "CargarLibro.html";
//        }
//     }
//     
//     
// @GetMapping("/lista")
//    public String lista(ModelMap modelo){
//        List<Libro> libros = libroServicio.listarLibros();
//        modelo.addAttribute("libros", libros);
//        return "PaneldeLibro.html";
//    }
//    
//      @GetMapping("/eliminar/{id}")
//    public String eliminar(@PathVariable String id){
//        try{
//            libroServicio.eliminarLibro(id);
//            return "redirect:/paneldelibro/lista";
//        }catch(Exception e){
//            return "listaLibros.html";
//        }
//    }
//    @GetMapping("/modificar/{id}")
//    public String modificar(ModelMap modelo,@PathVariable String id ){
//        try{
//        Libro libro = libroServicio.listarLibro(id);
//        modelo.addAttribute("libro", libro);
//        return "CargarLibro.html";
//        }catch(Exception e){
//            return "CargarLibro.html";
//        }
//        
//    }
//    } 

