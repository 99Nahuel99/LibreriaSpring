
package com.Libreria.LibreriaSpring.repositorios;

import com.Libreria.LibreriaSpring.entidades.Autor;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface AutorRepositorio extends JpaRepository<Autor, Object> {
    @Query("SELECT e FROM Autor e WHERE e.nombre= :nombre")
    public Autor buscarAtorPorNOmbre(@Param("nombre")String nombre);
    @Query("SELECT e FROM Autor e WHERE e.apellido= :apellido")
    public Autor buscarAtorPorApellido(@Param("apellido")String apellido);
    
        @Query("SELECT c FROM Autor c")
    public List<Autor> ListarAutores();
    
        
    @Query("SELECT c FROM Autor c WHERE c.id = :id")
    public Autor buscarPorId(@Param("id")String id);
    
}
