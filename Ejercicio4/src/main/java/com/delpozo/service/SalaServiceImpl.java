package com.delpozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.ISalaDAO;
import com.delpozo.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listarSala() {
		
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(String id) {
		
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
	
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(String id) {
	
		iSalaDAO.deleteById(id);
	}

}
