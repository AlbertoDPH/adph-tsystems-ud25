package com.delpozo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.IArticulosDAO;
import com.delpozo.dto.Articulos;

@Service
public class ArticuloServiceImpl implements IArticulosService {
	
	@Autowired
	IArticulosDAO iArticulosDAO;

	@Override
	public List<Articulos> listarArticulo() {
		
		return iArticulosDAO.findAll();
	}

	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		
		return iArticulosDAO.save(articulo);
	}

	@Override
	public Articulos articuloXID(Integer id) {
		
		return iArticulosDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		
		return iArticulosDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Integer id) {
		
		iArticulosDAO.deleteById(id);
	}

}
