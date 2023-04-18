package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Fabricantes;

/**
 * 
 * @author Alberto
 *
 */
public interface IFabricanteDAO extends JpaRepository<Fabricantes, Integer> {

}
