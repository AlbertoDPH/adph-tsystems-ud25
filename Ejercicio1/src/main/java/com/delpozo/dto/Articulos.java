package com.delpozo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulos") // en caso que la tabla sea diferente
public class Articulos {

	// Atributos de entidad articulos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int cod_articulo;
	private String nombre;
	private int precio;

	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricantes fabricante;

	// Constructores
	public Articulos() {

	}

	/**
	 * @param cod_articulo
	 * @param nombre
	 * @param precio
	 * @param fabricante
	 */
	public Articulos(int cod_articulo, String nombre, int precio, Fabricantes fabricante) {
		this.cod_articulo = cod_articulo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	// Getters y Setters
	public int getCod_articulo() {
		return cod_articulo;
	}

	public void setCod_articulo(int cod_articulo) {
		this.cod_articulo = cod_articulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricantes getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Articulos [cod_articulo=" + cod_articulo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante="
				+ fabricante + "]";
	}

}
