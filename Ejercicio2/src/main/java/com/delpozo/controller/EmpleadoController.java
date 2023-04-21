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
import com.delpozo.dto.Empleado;
import com.delpozo.service.EmpleadoServiceImpl;


@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleado() {
		return empleadoServiceImpl.listarEmpleado();
	}

	@PostMapping("/empleados")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@GetMapping("/empleados/{cod_empleado}")
	public Empleado vdnieoXID(@PathVariable(name = "cod_empleado") String dni) {

		Empleado empleado_xdni = new Empleado();

		empleado_xdni = empleadoServiceImpl.empleadoXID(dni);

		System.out.println("Empleado XID: " + empleado_xdni);

		return empleado_xdni;
	}
	
	@PutMapping("/empleados/{cod_empleado}")
	public Empleado actualizarEmpleado(@PathVariable(name="cod_empleado")String dni,@RequestBody Empleado empleado) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= empleadoServiceImpl.empleadoXID(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
			
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		System.out.println("El empleado actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{cod_empleado}")
	public void eliminarEmpleado(@PathVariable(name="cod_empleado")String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}
}
