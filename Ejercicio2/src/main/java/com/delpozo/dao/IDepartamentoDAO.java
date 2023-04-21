package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Departamento;

/**
 * 
 * @author Alberto
 *
 */
public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer> {

}
