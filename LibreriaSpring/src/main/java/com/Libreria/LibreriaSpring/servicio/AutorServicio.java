package com.Libreria.LibreriaSpring.servicio;

import com.Libreria.LibreriaSpring.entidades.Autor;
import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.repositorios.AutorRepositorio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Transactional
    public void agregarAutor(String nombre, String apellido) throws ErrorServicio {

        validar(nombre, apellido);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setApellido(apellido);
        autor.setAlta(Boolean.TRUE);
        autorRepositorio.save(autor);
    }
//    @Transactional
//     public List<Autor>listarTodosA(){
//         return autorRepositorio.findAll();
//     }
    
    
    
    
   

    @Transactional
    public void modificar(String nombre, String apellido) throws ErrorServicio {
        Autor autor = autorRepositorio.buscarAtorPorNOmbre(nombre);
        if (autor != null) {
            validar(nombre, apellido);
            autor.setNombre(nombre);
            autor.setApellido(apellido);
       
          autorRepositorio.save(autor);
        } else {
            throw new ErrorServicio("No se encontro la persona en la base de datos ");
        }
    }

    @Transactional
    public void elimiar(String nombre) throws ErrorServicio {
        Autor autor = autorRepositorio.buscarAtorPorNOmbre(nombre);
        if (autor != null) {
            autorRepositorio.delete(autor);
        } else {
            throw new ErrorServicio("No se encontro la persona en la base de datos ");
        }
    }
    @Transactional
    public void llenar(String nombre) throws ErrorServicio {
        Autor autor = autorRepositorio.buscarAtorPorNOmbre(nombre);
        if (autor != null) {
           
        } else {
            throw new ErrorServicio("No se encontro la persona en la base de datos ");
        }
    }

    public void validar(String nombre, String apellido) throws ErrorServicio {

        if (nombre == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre no puede ser nulo.");
        }
        if (apellido == null || nombre.isEmpty()) {
            throw new ErrorServicio("El nombre no puede ser nulo.");
        }
    }
      public List<Autor> listarAutores(){
        List<Autor> autores = autorRepositorio.ListarAutores();
        return autores;
    }
    
    public Autor listarAutor(String id){
        Autor autor = autorRepositorio.buscarPorId(id);
        return autor;
    }

}
