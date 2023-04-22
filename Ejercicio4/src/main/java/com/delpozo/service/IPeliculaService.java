package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Pelicula;

public interface IPeliculaService {
	
	//Metodos del CRUD
	public List<Pelicula> listarPelicula(); // Listar All

	public Pelicula guardarPelicula(Pelicula pelicula); // Guarda un pelicula CREATE

	public Pelicula peliculaXID(Integer id); // Leer datos de un pelicula READ

	public Pelicula actualizarPelicula(Pelicula pelicula); // Actualiza datos del pelicula UPDATE

	public void eliminarPelicula(Integer id);// Elimina el pelicula DELETE

}
