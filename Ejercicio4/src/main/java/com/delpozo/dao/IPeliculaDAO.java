package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Pelicula;

/**
 * 
 * @author Alberto
 *
 */
public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer> {

}
