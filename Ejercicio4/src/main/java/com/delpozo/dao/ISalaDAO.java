package com.delpozo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delpozo.dto.Sala;

/**
 * 
 * @author Alberto
 *
 */
public interface ISalaDAO extends JpaRepository<Sala, String> {

}
