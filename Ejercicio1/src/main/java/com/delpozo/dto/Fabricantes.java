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
@Table(name = "fabricantes") // en caso que la tabla sea diferente
public class Fabricantes {

	// Atributos de entidad fabricantes

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int cod_fabricante;
	private String nombre;

	@OneToMany
	@JoinColumn(name = "cod_fabricante")
	private List<Articulos> articulo;

	// Constructores
	public Fabricantes() {

	}

	/**
	 * @param cod_fabricante
	 * @param nombre
	 */
	public Fabricantes(int cod_fabricante, String nombre, List<Articulos> articulo) {
		this.cod_fabricante = cod_fabricante;
		this.nombre = nombre;
		this.articulo = articulo;
	}

	// Getters y Setters
	public int getCod_fabricante() {
		return cod_fabricante;
	}

	public void setCod_fabricante(int cod_fabricante) {
		this.cod_fabricante = cod_fabricante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setArticulo(List<Articulos> articulo) {
		this.articulo = articulo;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulos")
	public List<Articulos> getArticulo() {
		return articulo;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Fabricantes [cod_fabricante=" + cod_fabricante + ", nombre=" + nombre + "]";
	}

}
