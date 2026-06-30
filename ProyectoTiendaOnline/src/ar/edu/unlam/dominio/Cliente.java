package ar.edu.unlam.dominio;

public class Cliente implements Comparable<Cliente>{
	private Integer codigoCliente;
	private String nombre;
	private Double dinero;
	private CarritoDeCompras carrito;
	
	public Cliente(Integer codigoCliente, String nombre, Double dinero, CarritoDeCompras carrito) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.dinero = dinero;
		this.carrito = carrito;
	}

	public Integer getCodigoCliente() {
		return this.codigoCliente;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public CarritoDeCompras getCarrito() {
	    return carrito;
	}

	public Double getDinero() {
	    return dinero;
	}

	public void setDinero(Double dinero) {
	    this.dinero = dinero;
	}
	
	@Override
	public int compareTo(Cliente otro) {
		return this.codigoCliente.compareTo(otro.codigoCliente);
	}
}
