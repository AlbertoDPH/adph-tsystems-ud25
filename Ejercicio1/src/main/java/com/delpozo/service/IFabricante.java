package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Fabricantes;

public interface IFabricante {
	
	public List<Fabricantes> listarFabricante(); // Listar All

	public Fabricantes guardarFabricante(Fabricantes fabricante); // Guarda un fabricante CREATE

	public Fabricantes fabricanteXID(Integer id); // Leer datos de un fabricante READ

	public Fabricantes actualizarFabricante(Fabricantes fabricante); // Actualiza datos del fabricante UPDATE

	public void eliminarFabricante(Integer id);// Elimina el fabricante DELETE

}
