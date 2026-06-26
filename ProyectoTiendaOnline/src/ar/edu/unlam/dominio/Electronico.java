package ar.edu.unlam.dominio;

public class Electronico extends Producto{
	private String marca;
	private String modelo;
	private Integer garantiaMeses;
	
	public Electronico(Integer codigo, String nombre, String categoria, Integer cantidadDeStock, String marca,
			String modelo, Integer garantiaMeses) {
		super(codigo, nombre, cantidadDeStock);
		this.marca = marca;
		this.modelo = modelo;
		this.garantiaMeses = garantiaMeses;
	}
	
	
}
