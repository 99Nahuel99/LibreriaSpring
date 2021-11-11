/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Libreria.LibreriaSpring.repositorios;


import com.Libreria.LibreriaSpring.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rodriguez
 */
@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial, Object> {
@Query("SELECT e FROM Editorial e WHERE e.nombre= :nombre")
    public Editorial buscarAtorPorNOmbre(@Param("nombre")String nombre);   
}
