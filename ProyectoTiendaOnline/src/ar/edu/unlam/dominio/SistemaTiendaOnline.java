package ar.edu.unlam.dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class SistemaTiendaOnline {
	//      MAP <CLAVE , VALOR> 
	private Map<Integer, Cliente>clientes;
	private Map<Integer, Producto> productos; // 
	private TreeSet<Producto>catalogo;  // PARA MOSTRAR TODOS LOS PRODUCTOS QUE ESTEN DENTRO DEL SISTEMA
	
	public SistemaTiendaOnline() {
		this.clientes = new HashMap<>();
	    this.productos = new HashMap<>();
	    this.catalogo = new TreeSet<>();
	}
	
	public void agregarProducto(Producto producto) {
		
	}
	
	public void eliminarProducto(Integer codigo) {
		
	}
	
	public Producto buscarProductoPorCodigo(Integer codigo) {
		return null;
	}
	
	public void agregarCliente(Cliente cliente) {
		
	}
	
	public void realizarCompra() {
		
	}
	
	public TreeSet<Cliente> obtenerClientesPorNombreAscendente(){
		return null;
	}
	
	public TreeSet<Producto> obtenerProductosOrdenadosPorMarcaAscendente() {
		return null;
	
	}
	
	public TreeSet<Producto> obtenerProductosOrdenadosPorPrecioUnitarioDescendente() {
		return null;
	
	}
	
	public TreeSet<Producto> obtenerCatalogoCompleto(){
		return null;
	}
	
}
