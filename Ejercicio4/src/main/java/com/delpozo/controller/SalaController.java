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
import com.delpozo.dto.Sala;
import com.delpozo.service.SalaServiceImpl;


@RestController
@RequestMapping("/api")
public class SalaController {

	@Autowired
	SalaServiceImpl salaServiceImpl;

	@GetMapping("/salas")
	public List<Sala> listarSala() {
		return salaServiceImpl.listarSala();
	}

	@PostMapping("/salas")
	public Sala salvarSala(@RequestBody Sala sala) {
		return salaServiceImpl.guardarSala(sala);
	}

	@GetMapping("/salas/{cod_sala}")
	public Sala vdnieoXID(@PathVariable(name = "cod_sala") String dni) {

		Sala sala_xdni = new Sala();

		sala_xdni = salaServiceImpl.salaXID(dni);

		System.out.println("Sala XID: " + sala_xdni);

		return sala_xdni;
	}
	
	@PutMapping("/salas/{cod_sala}")
	public Sala actualizarSala(@PathVariable(name="cod_sala")String dni,@RequestBody Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaServiceImpl.salaXID(dni);
		
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
			
		sala_actualizado = salaServiceImpl.actualizarSala(sala_seleccionado);
		
		System.out.println("El sala actualizado es: "+ sala_actualizado);
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/salas/{cod_sala}")
	public void eliminarSala(@PathVariable(name="cod_sala")String dni) {
		salaServiceImpl.eliminarSala(dni);
	}
}
