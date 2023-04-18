package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Articulos;

public interface IArticulosService {

	public List<Articulos> listarArticulo(); // Listar All

	public Articulos guardarArticulo(Articulos articulo); // Guarda un articulo CREATE

	public Articulos articuloXID(Integer id); // Leer datos de un articulo READ

	public Articulos actualizarArticulo(Articulos articulo); // Actualiza datos del articulo UPDATE

	public void eliminarArticulo(Integer id);// Elimina el articulo DELETE

}
