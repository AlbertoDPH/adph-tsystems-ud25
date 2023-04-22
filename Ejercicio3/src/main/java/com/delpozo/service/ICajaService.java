package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Caja;

public interface ICajaService {
	
	//Metodos del CRUD
	public List<Caja> listarCaja(); // Listar All

	public Caja guardarCaja(Caja caja); // Guarda un caja CREATE

	public Caja cajaXID(String id); // Leer datos de un caja READ

	public Caja actualizarCaja(Caja caja); // Actualiza datos del caja UPDATE

	public void eliminarCaja(String id);// Elimina el caja DELETE

}
