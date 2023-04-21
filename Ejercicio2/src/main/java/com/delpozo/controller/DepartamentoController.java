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

import com.delpozo.dto.Departamento;
import com.delpozo.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;

	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamento() {
		return departamentoServiceImpl.listarDepartamento();
	}

	@PostMapping("/departamentos")
	public Departamento salvarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}

	@GetMapping("/departamentos/{cod_departamento}")
	public Departamento departamentoXID(@PathVariable(name = "cod_departamento") Integer id) {

		Departamento departamento_xid = new Departamento();

		departamento_xid = departamentoServiceImpl.departamentoXID(id);

		System.out.println("Departamento XID: " + departamento_xid);

		return departamento_xid;
	}

	@PutMapping("/departamentos/{cod_departamento}")
	public Departamento actualizarDepartamento(@PathVariable(name = "cod_departamento") Integer id,
			@RequestBody Departamento departamento) {

		Departamento departamento_seleccionado = new Departamento();
		Departamento departamento_actualizado = new Departamento();

		departamento_seleccionado = departamentoServiceImpl.departamentoXID(id);

		departamento_seleccionado.setNombre(departamento.getNombre());

		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);

		System.out.println("El departamento actualizado es: " + departamento_actualizado);

		return departamento_actualizado;
	}

	@DeleteMapping("/departamentos/{cod_departamento}")
	public void eliminarDepartamento(@PathVariable(name = "cod_departamento") Integer id) {
		departamentoServiceImpl.eliminarDepartamento(id);
	}

}
