package com.Libreria.LibreriaSpring.servicio;

import com.Libreria.LibreriaSpring.entidades.Editorial;
import com.Libreria.LibreriaSpring.error.ErrorServicio;
import com.Libreria.LibreriaSpring.repositorios.EditorialRepositorio;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {

    @Autowired
    private EditorialRepositorio er;


    @Transactional
    public void agregarEditorial(String nombre) throws ErrorServicio {
        validar(nombre);
        Editorial editorial =new Editorial();
        editorial.setNombre(nombre);
        editorial.setAlta(true);
        er.save(editorial);
    }
      @Transactional
     public List<Editorial>listarTodosE(){
         return er.findAll();
     }

    @Transactional
    public void modificar(String nombre) throws ErrorServicio {
     Editorial editorial =er.buscarAtorPorNOmbre(nombre);
      if ( editorial != null) {
            validar(nombre);
            editorial.setNombre(nombre);
          er.save(editorial);
        } else {
            throw new ErrorServicio("No se encontro la editorial en la base de datos ");
        }
    }

    public void elimiar(String nombre) throws ErrorServicio {
         Editorial editorial =er.buscarAtorPorNOmbre(nombre);
       if ( editorial != null) {
         er.delete(editorial);
        } else {
            throw new ErrorServicio("No se encontro la editorial en la base de datos ");
        }
    }

    public void validar(String nombre) throws ErrorServicio {
        if (nombre == null || nombre.isEmpty()) {

            throw new ErrorServicio("El nombre no puede ser nulo.");
        }
    }

}
