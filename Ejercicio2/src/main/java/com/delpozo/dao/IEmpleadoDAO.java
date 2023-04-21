package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Empleado;

/**
 * 
 * @author Alberto
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, String> {

}
