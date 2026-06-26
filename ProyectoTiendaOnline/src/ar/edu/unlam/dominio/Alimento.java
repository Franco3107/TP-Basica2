package ar.edu.unlam.dominio;

import java.time.LocalDate;

public class Alimento extends Producto {
	private LocalDate fechaDeVencimiento;
	private Boolean estaVencido;
	private Integer peso;
	
	public Alimento(Integer codigo, String nombre, String categoria, Integer cantidadDeStock,
			LocalDate fechaDeVencimiento, Integer peso) {
		super(codigo, nombre, cantidadDeStock);
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.estaVencido = false;
		this.peso = peso;
	}
	
	
	
	
}
