package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ar.edu.unlam.excepciones.CarritoSinProductosException;

public class CarritoDeCompras {
	private static Integer contadorCarrito =0;
	
	private Integer IdCarrito;
	private Map<Producto, Integer> productos;  //GUARDA EL PRODUCTO COMO CLAVE Y LA CANTIDAD COMO VALOR

	public CarritoDeCompras() {
		this.IdCarrito = ++contadorCarrito;
		this.productos = new HashMap<>();
	}
	
	public void agregarProducto(Producto producto, Integer cantidadDeUnidades) {
		this.productos.put(producto, cantidadDeUnidades);
		
		//Se podria mejorar, ya al agregar dos veces el mismo producto se sobreescriben
		// y no se suma la cantidad de unidades
		
	}
	public void sacarProducto(Producto producto) throws CarritoSinProductosException {
		if (this.productos.isEmpty()) {
			throw new CarritoSinProductosException("El carrito No tiene Productos");
		}
		this.productos.remove(producto);
		
	}
	
	public Double calcularTotal() {
	    Double total = 0.0;

	    for (Map.Entry<Producto, Integer> item : productos.entrySet()) {
	        total += item.getKey().getPrecio() * item.getValue();
	    }

	    return total;
	}
	
	public void vaciarCarrito() {
	    productos.clear();
	}
	
	
	public ArrayList<Producto> obtenerUnaListaDeProductosDentroDelCarrito() {
		ArrayList<Producto> lista = new ArrayList<>(this.productos.keySet());
		return lista; 
	}

	public Map<Producto, Integer> getProductos() {
		return productos;
	}
	
	
	
	
	
}
