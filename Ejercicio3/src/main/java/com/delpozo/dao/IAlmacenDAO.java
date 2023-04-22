package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Almacen;

/**
 * 
 * @author Alberto
 *
 */
public interface IAlmacenDAO extends JpaRepository<Almacen, Integer> {

}
