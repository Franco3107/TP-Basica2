package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarritoDeCompras {
	private static Integer contadorCarrito =0;
	
	private Integer IdCarrito;
	private Map<Producto, Integer> productos;  //GUARDA EL PRODUCTO COMO CLAVE Y LA CANTIDAD COMO VALOR

	public CarritoDeCompras() {
		this.IdCarrito = ++contadorCarrito;
		this.productos = new HashMap<>();
	}
	
	public void agregarProducto() {
		
	}
	public void sacarProducto() {
		
	}
	public void calcularTotal() {
		
	}
	public void vaciarCarrito() {
		
	}
	
	public ArrayList<Producto> obtenerProductos() {
	    return null;
	}
	
}
