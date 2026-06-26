package ar.edu.unlam.dominio;

public abstract class Producto {
	private Integer codigo;
	private String nombre;
	private Integer cantidadDeStock;
	private Boolean stockDisponible;
	
	
	
public Producto(Integer codigo, String nombre,  Integer cantidadDeStock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadDeStock = cantidadDeStock;
		this.stockDisponible = true;
	}

// GETTER AND SETTER


}

