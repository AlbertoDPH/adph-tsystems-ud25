package com.delpozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.IAlmacenDAO;
import com.delpozo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacen() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXID(Integer id) {
		
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
	
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Integer id) {
	
		iAlmacenDAO.deleteById(id);
	}

}
