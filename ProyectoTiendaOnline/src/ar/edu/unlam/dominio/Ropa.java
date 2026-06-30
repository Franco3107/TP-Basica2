package ar.edu.unlam.dominio;

import ar.edu.unlam.enums.TipoRopa;
import ar.edu.unlam.interfaces.Descontable;

public class Ropa extends Producto implements Descontable {
	private String color;
	private String Material;
	private Integer talle;
	private TipoRopa tipoRopa;
	
	public Ropa(String marca, Integer cantidadDeStock, Double precio, String color, String material,
			Integer talle, TipoRopa tipoRopa) {
		super(marca, cantidadDeStock, precio);
		this.color = color;
		this.Material = material;
		this.talle = talle;
		this.tipoRopa = tipoRopa;
	}

	@Override
	public Double aplicarDescuento() {
	    return getPrecio() * 0.80;
	}
	
	
}
