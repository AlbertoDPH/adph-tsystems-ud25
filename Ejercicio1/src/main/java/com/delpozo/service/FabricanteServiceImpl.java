package com.delpozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.IFabricanteDAO;
import com.delpozo.dto.Fabricantes;

@Service
public class FabricanteServiceImpl implements IFabricante {

	// Utilizamos los metodos de la interfaz IFabricante, es como si instanciaramos
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricantes> listarFabricante() {

		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {

		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricantes fabricanteXID(Integer id) {

		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {

		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Integer id) {

		iFabricanteDAO.deleteById(id);
	}

}
