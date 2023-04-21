package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Departamento;

public interface IDepartamentoService {
	
	//Metodos del CRUD
	public List<Departamento> listarDepartamento(); // Listar All

	public Departamento guardarDepartamento(Departamento departamento); // Guarda un departamento CREATE

	public Departamento departamentoXID(Integer id); // Leer datos de un departamento READ

	public Departamento actualizarDepartamento(Departamento departamento); // Actualiza datos del departamento UPDATE

	public void eliminarDepartamento(Integer id);// Elimina el departamento DELETE

}
