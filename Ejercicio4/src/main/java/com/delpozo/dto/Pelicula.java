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
@Table(name = "peliculas") // en caso que la tabla sea diferente
public class Pelicula {

	// Atributos de entidad pelicula

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int cod_pelicula;
	private String nombre;
	private int calificacion_edad;

	@OneToMany
	@JoinColumn(name = "cod_pelicula")
	private List<Sala> salas;

	// Constructores
	public Pelicula() {

	}

	/**
	 * 
	 * @param cod_pelicula
	 * @param nombre
	 * @param calificacion_edad
	 */
	public Pelicula(int cod_pelicula, String nombre, int calificacion_edad) {
		this.cod_pelicula = cod_pelicula;
		this.nombre = nombre;
		this.calificacion_edad = calificacion_edad;
	}

	// Getters y Setters

	public int getCod_pelicula() {
		return cod_pelicula;
	}

	public void setCod_pelicula(int cod_pelicula) {
		this.cod_pelicula = cod_pelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalificacion_edad() {
		return calificacion_edad;
	}

	public void setCalificacion_edad(int calificacion_edad) {
		this.calificacion_edad = calificacion_edad;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return salas;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Pelicula [cod_pelicula=" + cod_pelicula + ", nombre=" + nombre + ", calificacion_edad="
				+ calificacion_edad + "]";
	}

}
