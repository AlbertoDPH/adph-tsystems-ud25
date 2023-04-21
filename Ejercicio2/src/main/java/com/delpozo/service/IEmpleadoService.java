package com.delpozo.service;

import java.util.List;

import com.delpozo.dto.Empleado;

public interface IEmpleadoService {
	
	//Metodos del CRUD
	public List<Empleado> listarEmpleado(); // Listar All

	public Empleado guardarEmpleado(Empleado empleado); // Guarda un empleado CREATE

	public Empleado empleadoXID(String id); // Leer datos de un empleado READ

	public Empleado actualizarEmpleado(Empleado empleado); // Actualiza datos del empleado UPDATE

	public void eliminarEmpleado(String id);// Elimina el empleado DELETE

}
