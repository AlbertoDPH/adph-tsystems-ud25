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

import com.delpozo.dto.Articulos;
import com.delpozo.dto.Fabricantes;
import com.delpozo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;

	@GetMapping("/articulos")
	public List<Articulos> listarArticulos() {
		return articuloServiceImpl.listarArticulo();
	}

	@PostMapping("/articulos")
	public Articulos salvarArticulo(@RequestBody Articulos articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}

	@GetMapping("/articulos/{cod_articulo}")
	public Articulos videoXID(@PathVariable(name = "cod_articulo") Integer id) {

		Articulos articulo_xid = new Articulos();

		articulo_xid = articuloServiceImpl.articuloXID(id);

		System.out.println("Articulo XID: " + articulo_xid);

		return articulo_xid;
	}
	
	@PutMapping("/articulos/{cod_articulo}")
	public Articulos actualizarArticulo(@PathVariable(name="cod_articulo")Integer id,@RequestBody Articulos articulo) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articuloServiceImpl.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
			
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{cod_articulo}")
	public void eliminarArticulo(@PathVariable(name="cod_articulo")Integer id) {
		articuloServiceImpl.eliminarArticulo(id);
	}
}
