package ar.edu.unlam.dominio;

import ar.edu.unlam.enums.TipoElectronico;
import ar.edu.unlam.interfaces.Descontable;

public class Electronico extends Producto implements Descontable{
	private TipoElectronico tipoElectronico;
	private String modelo;
	private Integer garantiaMeses;
	
	public Electronico(String marca,Integer cantidadDeStock, Double precio, TipoElectronico tipoElectronico,
			String modelo, Integer garantiaMeses) {
		super(marca, cantidadDeStock, precio);
		this.tipoElectronico= tipoElectronico;
		this.modelo = modelo;
		this.garantiaMeses = garantiaMeses;
	}

	@Override
	public Double aplicarDescuento() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
