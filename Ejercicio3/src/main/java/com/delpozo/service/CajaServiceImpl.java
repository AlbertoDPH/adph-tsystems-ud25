package com.delpozo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delpozo.dao.ICajaDAO;
import com.delpozo.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCaja() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja cajaXID(String id) {
		
		return iCajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
	
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String id) {
	
		iCajaDAO.deleteById(id);
	}

}
