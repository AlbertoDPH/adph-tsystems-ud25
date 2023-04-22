package com.delpozo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cajas") // en caso que la tabla sea diferente
public class Caja {

	// Atributos de entidad caja
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String num_referencia;
	private String contenido;
	private int valor;

	@ManyToOne
	@JoinColumn(name = "almacen", referencedColumnName = "codigo")
	private Almacen almacen;

	// Constructores
	public Caja() {

	}

	/**
	 * 
	 * @param num_referencia
	 * @param contenido
	 * @param valor
	 */
	public Caja(String num_referencia, String contenido, int valor) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
	}

	// Getters y Setters
	public String getNum_referencia() {
		return num_referencia;
	}

	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	// Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}

}
