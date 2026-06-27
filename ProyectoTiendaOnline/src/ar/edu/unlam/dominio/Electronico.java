package ar.edu.unlam.dominio;

import ar.edu.unlam.enums.TipoElectronico;

public class Electronico extends Producto{
	private TipoElectronico tipoElectronico;
	private String modelo;
	private Integer garantiaMeses;
	
	public Electronico(String marca,Integer cantidadDeStock, TipoElectronico tipoElectronico,
			String modelo, Integer garantiaMeses) {
		super(marca, cantidadDeStock);
		this.tipoElectronico= tipoElectronico;
		this.modelo = modelo;
		this.garantiaMeses = garantiaMeses;
	}
	
	
}
