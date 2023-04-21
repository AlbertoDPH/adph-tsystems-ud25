package com.delpozo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos") // en caso que la tabla sea diferente
public class Departamento {

	// Atributos de entidad departamento

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int cod_departamento;
	private String nombre;
	private int presupuesto;

	@OneToMany
	@JoinColumn(name = "cod_departamento")
	private List<Empleado> empleado;

	// Constructores
	public Departamento() {

	}

	/**
	 * 
	 * @param cod_departamento
	 * @param nombre
	 * @param presupuesto
	 */
	public Departamento(int cod_departamento, String nombre, int presupuesto) {
		this.cod_departamento = cod_departamento;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		
	}

	// Getters y Setters
	public int getCod_departamento() {
		return cod_departamento;
	}

	public void setCod_departamento(int cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Departamento [cod_departamento=" + cod_departamento + ", nombre=" + nombre + ", presupuesto="
				+ presupuesto + ", empleado=" + empleado + "]";
	}

}
