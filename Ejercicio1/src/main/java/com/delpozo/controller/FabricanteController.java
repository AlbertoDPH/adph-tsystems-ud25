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

import com.delpozo.dto.Fabricantes;
import com.delpozo.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;

	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes() {
		return fabricanteServiceImpl.listarFabricante();
	}

	@PostMapping("/fabricantes")
	public Fabricantes salvarFabricante(@RequestBody Fabricantes fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}

	@GetMapping("/fabricantes/{cod_fabricante}")
	public Fabricantes fabricanteXID(@PathVariable(name = "cod_fabricante") Integer id) {

		Fabricantes fabricante_xid = new Fabricantes();

		fabricante_xid = fabricanteServiceImpl.fabricanteXID(id);

		System.out.println("Fabricante XID: " + fabricante_xid);

		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{cod_fabricante}")
	public Fabricantes actualizarFabricante(@PathVariable(name="cod_fabricante")Integer id,@RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado= new Fabricantes();
		Fabricantes fabricante_actualizado= new Fabricantes();
		
		fabricante_seleccionado= fabricanteServiceImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
			
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{cod_fabricante}")
	public void eliminarFabricante(@PathVariable(name="cod_fabricante")Integer id) {
		fabricanteServiceImpl.eliminarFabricante(id);
	}

}
