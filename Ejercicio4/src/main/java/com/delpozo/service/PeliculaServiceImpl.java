package com.delpozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.IPeliculaDAO;
import com.delpozo.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDAO iPeliculaDAO;
	
	@Override
	public List<Pelicula> listarPelicula() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(Integer id) {
		
		return iPeliculaDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
	
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(Integer id) {
	
		iPeliculaDAO.deleteById(id);
	}

}
