package com.delpozo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delpozo.dto.Pelicula;
import com.delpozo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {

	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;

	@GetMapping("/peliculas")
	public List<Pelicula> listarPelicula() {
		return peliculaServiceImpl.listarPelicula();
	}

	@PostMapping("/peliculas")
	public Pelicula salvarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}

	@GetMapping("/peliculas/{cod_pelicula}")
	public Pelicula peliculaXID(@PathVariable(name = "cod_pelicula") Integer id) {

		Pelicula pelicula_xid = new Pelicula();

		pelicula_xid = peliculaServiceImpl.peliculaXID(id);

		System.out.println("Pelicula XID: " + pelicula_xid);

		return pelicula_xid;
	}

	@PutMapping("/peliculas/{cod_pelicula}")
	public Pelicula actualizarPelicula(@PathVariable(name = "cod_pelicula") Integer id,
			@RequestBody Pelicula pelicula) {

		Pelicula pelicula_seleccionado = new Pelicula();
		Pelicula pelicula_actualizado = new Pelicula();

		pelicula_seleccionado = peliculaServiceImpl.peliculaXID(id);

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacion_edad(pelicula.getCalificacion_edad());
		
		pelicula_actualizado = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionado);

		System.out.println("El pelicula actualizado es: " + pelicula_actualizado);

		return pelicula_actualizado;
	}

	@DeleteMapping("/peliculas/{cod_pelicula}")
	public void eliminarPelicula(@PathVariable(name = "cod_pelicula") Integer id) {
		peliculaServiceImpl.eliminarPelicula(id);
	}

}
