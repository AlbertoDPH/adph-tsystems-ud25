package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Sala;

public interface ISalaService {
	
	//Metodos del CRUD
	public List<Sala> listarSala(); // Listar All

	public Sala guardarSala(Sala sala); // Guarda un sala CREATE

	public Sala salaXID(String id); // Leer datos de un sala READ

	public Sala actualizarSala(Sala sala); // Actualiza datos del sala UPDATE

	public void eliminarSala(String id);// Elimina el sala DELETE

}
