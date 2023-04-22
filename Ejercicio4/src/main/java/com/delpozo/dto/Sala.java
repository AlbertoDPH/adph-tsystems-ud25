package com.delpozo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salas") // en caso que la tabla sea diferente
public class Sala {

	// Atributos de entidad sala
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int cod_sala;
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "pelicula", referencedColumnName = "cod_pelicula")
	private Pelicula pelicula;

	// Constructores
	public Sala() {

	}

	/**
	 * 
	 * @param cod_sala
	 * @param nombre
	 * @param pelicula
	 */
	public Sala(int cod_sala, String nombre, Pelicula pelicula) {
		this.cod_sala = cod_sala;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	// Getters y Setters
	public int getCod_sala() {
		return cod_sala;
	}

	public void setCod_sala(int cod_sala) {
		this.cod_sala = cod_sala;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Sala [cod_sala=" + cod_sala + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
	}

}
