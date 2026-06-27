package ar.edu.unlam.dominio;

import java.time.LocalDate;

import ar.edu.unlam.enums.TipoAlimento;

public class Alimento extends Producto {
	private TipoAlimento tipoAlimento;
	private LocalDate fechaDeVencimiento;
	private Boolean estaVencido;
	private Integer peso;
	
	public Alimento(String marca, Integer cantidadDeStock, TipoAlimento tipoAlimento, LocalDate fechaDeVencimiento, Integer peso) {
		super(marca, cantidadDeStock);
		this.tipoAlimento = tipoAlimento;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.estaVencido = false;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Alimento [fechaDeVencimiento=" + fechaDeVencimiento + ", estaVencido=" + estaVencido + ", peso=" + peso
				+ "]";
	}

	
	
	
	
	
}
