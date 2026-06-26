package ar.edu.unlam.dominio;

public class Cliente {
	private Integer codigoCliente;
	private String nombre;
	private String direccion;
	private CarritoDeCompras carrito;
	
	public Cliente(Integer codigoCliente, String nombre, String direccion, CarritoDeCompras carrito) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.carrito = carrito;
	}
	
	
}
