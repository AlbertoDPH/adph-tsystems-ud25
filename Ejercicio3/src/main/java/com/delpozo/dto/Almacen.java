package com.delpozo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacenes") // en caso que la tabla sea diferente
public class Almacen {

	// Atributos de entidad almacen

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int codigo;
	private String lugar;
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Caja> cajas;

	// Constructores
	public Almacen() {

	}

	public Almacen(int codigo, String lugar, int capacidad) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;

	}

	// Getters y Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setCaja(List<Caja> cajas) {
		this.cajas = cajas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja() {
		return cajas;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}

}
