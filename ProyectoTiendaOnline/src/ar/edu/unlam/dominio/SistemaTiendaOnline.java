package ar.edu.unlam.dominio;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import ar.edu.unlam.excepciones.ProductoNoEncontradoException;

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
		
		productos.put(producto.getCodigo(), producto);
	    catalogo.add(producto);
	}
	
	public void eliminarProducto(Integer codigo) throws ProductoNoEncontradoException {
		Producto productoBuscado = buscarProductoPorCodigo(codigo);

	    productos.remove(codigo);
	    catalogo.remove(productoBuscado);
	}
	
	public Producto buscarProductoPorCodigo(Integer codigo) throws ProductoNoEncontradoException {
		Producto producto = productos.get(codigo);
		
		if(producto == null) {
			throw new ProductoNoEncontradoException("Producto no encontrado");
		}
		
		return producto;
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.put(cliente.getCodigoCliente(), cliente);
	}
	
	public void realizarCompra() {
		
	}
	
	public TreeSet<Cliente> obtenerClientesPorNombreAscendente(){
		
		TreeSet<Cliente> clientesOrdenNombreAsc = new TreeSet<>(new OrdenNombreClienteAsc());
		clientesOrdenNombreAsc.addAll(clientes.values());  	
		
		return clientesOrdenNombreAsc;
	}
	
	public TreeSet<Producto> obtenerProductosOrdenadosPorMarcaAscendente() {
		return null;
	
	}
	
	public TreeSet<Producto> obtenerProductosOrdenadosPorPrecioUnitarioDescendente() {
		return null;
	
	}
	
	public TreeSet<Producto> obtenerCatalogoCompleto(){

	    return catalogo;
	}
	
	public Cliente buscarClientePorCodigo(Integer codigo) {
	    return clientes.get(codigo);
	}
	
}
