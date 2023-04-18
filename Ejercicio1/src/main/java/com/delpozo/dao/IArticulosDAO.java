package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Articulos;

/**
 * 
 * @author Alberto
 *
 */
public interface IArticulosDAO extends JpaRepository<Articulos, Integer> {

}
