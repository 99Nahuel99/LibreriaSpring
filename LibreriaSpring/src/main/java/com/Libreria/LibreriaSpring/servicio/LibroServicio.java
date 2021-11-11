package com.Libreria.LibreriaSpring.servicio;

import com.Libreria.LibreriaSpring.entidades.Libro;
import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.repositorios.LibroRepositorio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio LibroRepositorio;
    
    @Transactional
    public void registrar(String titulo, Integer anio ) throws ErrorServicio {
        validar(titulo, anio);
        Libro libro = new Libro();
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        
        libro.setAlta(Boolean.TRUE);
        LibroRepositorio.save(libro);
    }
    
//   @Transactional
//   public void AgregarLibro(String titulo)throws ErrorServicio{
//       validar2(titulo);
//      Libro libro = new Libro();
//        libro.setTitulo(titulo); 
//        libro.setAlta(Boolean.TRUE);
//        LibroRepositorio.save(libro);
//   }
    
    @Transactional
    public void modificar(String id, String titulo, Integer anio) throws ErrorServicio {
        Libro libro = LibroRepositorio.buscarAtorPorTitulo(titulo);
        if (libro != null) {
            validar(titulo,anio);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
        
            LibroRepositorio.save(libro);
        } else {
            throw new ErrorServicio("No se encontro el libro en la base de datos ");
        }
 
    }
    
    @Transactional 
    public void eliminarLibro(String id){
        Libro libro = LibroRepositorio.buscarPorId(id);
        LibroRepositorio.delete(libro);
    }
   
        
    
     @Transactional
    public void deshabilitar(String id) throws ErrorServicio {
        
    }
     @Transactional
    public void habilitar(String id) throws ErrorServicio {
        
    }
    public List<Libro> listarLibros(){
        List<Libro> libros = LibroRepositorio.ListarLibros();
        return libros;
    }
      public Libro listarLibro(String id){
        Libro libro = LibroRepositorio.buscarPorId(id);
        return libro;
    }
    
    
    private void validar(String titulo, Integer anio) throws ErrorServicio {
        
        if (titulo == null || titulo.isEmpty()) {
            throw new ErrorServicio("El titulo mo puede ser nulo.");
        }
        if (anio == null) {
            throw new ErrorServicio("El añio mo puede ser nulo.");
        }   
    }
//    public void validar2(String titulo)throws ErrorServicio {
//       if (titulo == null || titulo.isEmpty()) {
//            throw new ErrorServicio("El titulo mo puede ser nulo.");
//        }  
//    }
}
