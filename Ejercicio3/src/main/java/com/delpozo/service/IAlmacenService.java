package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Almacen;

public interface IAlmacenService {
	
	//Metodos del CRUD
	public List<Almacen> listarAlmacen(); // Listar All

	public Almacen guardarAlmacen(Almacen almacen); // Guarda un almacen CREATE

	public Almacen almacenXID(Integer id); // Leer datos de un almacen READ

	public Almacen actualizarAlmacen(Almacen almacen); // Actualiza datos del almacen UPDATE

	public void eliminarAlmacen(Integer id);// Elimina el almacen DELETE

}
