/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Libreria.LibreriaSpring.repositorios;

import com.Libreria.LibreriaSpring.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rodriguez
 */
@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Object> {
@Query("SELECT e FROM Libro e WHERE e.titulo= :titulo")
    public Libro buscarAtorPorTitulo(@Param("titulo")String titulo);
  
      @Query("SELECT c FROM Libro c")
    public List<Libro> ListarLibros();
    
        
    @Query("SELECT c FROM Libro c WHERE c.id = :id")
    public Libro buscarPorId(@Param("id")String id);
}
