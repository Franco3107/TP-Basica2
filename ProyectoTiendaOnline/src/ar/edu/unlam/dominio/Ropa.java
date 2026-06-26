package ar.edu.unlam.dominio;

import ar.edu.unlam.enums.TipoRopa;

public class Ropa extends Producto {
	private String color;
	private String Material;
	private Integer talle;
	private TipoRopa tipoRopa;
	
	public Ropa(Integer codigo, String nombre, String categoria, Integer cantidadDeStock, String color, String material,
			Integer talle, TipoRopa tipoRopa) {
		super(codigo, nombre, cantidadDeStock);
		this.color = color;
		Material = material;
		this.talle = talle;
		this.tipoRopa = tipoRopa;
	}
	
	
}
