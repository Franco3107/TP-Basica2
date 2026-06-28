package ar.edu.unlam.dominio;

import java.time.LocalDate;

import ar.edu.unlam.enums.TipoAlimento;
import ar.edu.unlam.interfaces.Caducable;

public class Alimento extends Producto implements Caducable{
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
		return "Alimento [tipoAlimento=" + tipoAlimento + ", fechaDeVencimiento=" + fechaDeVencimiento
				+ ", estaVencido=" + estaVencido + ", peso=" + peso + "]";
	}



	@Override
	public Boolean estaVencido() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
