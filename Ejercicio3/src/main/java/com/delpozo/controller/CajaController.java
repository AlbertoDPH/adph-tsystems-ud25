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
import com.delpozo.dto.Caja;
import com.delpozo.service.CajaServiceImpl;


@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;

	@GetMapping("/cajas")
	public List<Caja> listarCaja() {
		return cajaServiceImpl.listarCaja();
	}

	@PostMapping("/cajas")
	public Caja salvarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}

	@GetMapping("/cajas/{num_referencia}")
	public Caja vdnieoXID(@PathVariable(name = "num_referencia") String dni) {

		Caja caja_xdni = new Caja();

		caja_xdni = cajaServiceImpl.cajaXID(dni);

		System.out.println("Caja XID: " + caja_xdni);

		return caja_xdni;
	}
	
	@PutMapping("/cajas/{num_referencia}")
	public Caja actualizarCaja(@PathVariable(name="num_referencia")String dni,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaServiceImpl.cajaXID(dni);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
			
		caja_actualizado = cajaServiceImpl.actualizarCaja(caja_seleccionado);
		
		System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{num_referencia}")
	public void eliminarCaja(@PathVariable(name="num_referencia")String dni) {
		cajaServiceImpl.eliminarCaja(dni);
	}
}
