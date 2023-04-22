package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Caja;

/**
 * 
 * @author Alberto
 *
 */
public interface ICajaDAO extends JpaRepository<Caja, String> {

}
