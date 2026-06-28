package ar.edu.unlam.dominio;

import java.util.Map;

public class CarritoDeCompras {
	private static Integer CONTADOR_ID_CARRITO =0;
	
	private Integer IdCarrito;
	private Map<Producto, Integer> productos;  //GUARDA EL PRODUCTO COMO CLAVE Y LA CANTIDAD COMO VALOR

	public CarritoDeCompras(Map<Producto, Integer> productos) {
		this.IdCarrito = ++CONTADOR_ID_CARRITO;
		this.productos = productos;
	}
	
	public void agregarProducto() {
		
	}
	public void sacarProducto() {
		
	}
	public void calcularTotal() {
		
	}
	public void vaciarCarrito() {
		
	}
	
	
	
}
