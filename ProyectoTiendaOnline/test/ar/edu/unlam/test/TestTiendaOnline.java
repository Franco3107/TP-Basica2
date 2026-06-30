package ar.edu.unlam.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.dominio.Alimento;
import ar.edu.unlam.dominio.CarritoDeCompras;
import ar.edu.unlam.dominio.Cliente;
import ar.edu.unlam.dominio.Electronico;
import ar.edu.unlam.dominio.Producto;
import ar.edu.unlam.dominio.Ropa;
import ar.edu.unlam.dominio.SistemaTiendaOnline;
import ar.edu.unlam.enums.TipoAlimento;
import ar.edu.unlam.enums.TipoElectronico;
import ar.edu.unlam.enums.TipoRopa;
import ar.edu.unlam.excepciones.CarritoSinProductosException;
import ar.edu.unlam.excepciones.ProductoNoEncontradoException;
import ar.edu.unlam.excepciones.SaldoInsuficienteException;
import ar.edu.unlam.excepciones.StockInsuficienteException;

public class TestTiendaOnline {

	// PRODUCTOS
	@Test
	public void crearUnAlimentoCorrectamente() {
		Alimento a1 = new Alimento("Marca", 10, 100.0, TipoAlimento.ARROZ, LocalDate.of(2026, 10, 10), 2);
		 
		assertNotNull(a1);
	}
	@Test
	public void crearRopaCorrectamente() {
		Ropa r1 = new Ropa("Marca", 4, 500.0, "ROJO","ALGOHODON" , 12, TipoRopa.BUZO);
		
		assertNotNull(r1);
	}
	@Test
	public void crearUnElectronicoCorrectamente() {
		Electronico e1 = new Electronico("Fravega",10, 5000.0,TipoElectronico.AIRE_ACONDICIONADO, "A348F",12);
		
		assertNotNull(e1);
	}
	@Test 
	public void dadoQueExisteUnProductoAgregarStock() {
	    Producto producto = new Electronico("Samsung", 0, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
	    assertFalse(producto.hayStock());

	    producto.agregarStock();

	    assertTrue(producto.hayStock());
	}

	@Test
	public void dadoQueExisteUnAlimentoComprobarQueEstaVencido() {
	    Alimento alimento = new Alimento("Marca", 10, 100.0, TipoAlimento.CARNE, LocalDate.of(2020, 1, 1), 2);

	    assertTrue(alimento.estaVencido());
	}
	
	@Test
	public void dadoQueExisteUnProductoAgregarloAlCatalogo(){
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		Producto productoE = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
		sistema.agregarProducto(productoE);
		
		TreeSet<Producto> catalogoProducto= sistema.obtenerCatalogoCompleto();
		
		assertEquals(1, catalogoProducto.size());
		
	}
	@Test	
	public void dadoQueExisteUnProductoEliminarloDelCatalogo() throws ProductoNoEncontradoException {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		Producto productoE = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
		
		sistema.agregarProducto(productoE);
		TreeSet<Producto> productos= sistema.obtenerCatalogoCompleto();
		
		sistema.eliminarProducto(productoE.getCodigo());
		
		productos = sistema.obtenerCatalogoCompleto();
		assertEquals(0, productos.size());

	}
	
	
	// CLIENTE
	@Test
	public void crearClienteCorrectamente() {
	    CarritoDeCompras carrito = new CarritoDeCompras();

	    Cliente cliente = new Cliente(1, "Santi", 10000.0, carrito);

	    assertNotNull(cliente);
	}
//	@Test
//	public void DadoQueExisteUnClienteAsignarleUnCarritoCorrectamente() {
//		Cliente c1 = new Cliente 
//		
//		
//	}
	
	// CARRITO DE COMPRAS
	@Test 
	public void agregarProductoAlCarritoCorrectamente() {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		CarritoDeCompras carrito = new CarritoDeCompras();
		Cliente c1 = new Cliente(1,"NOMBRE",20000.0, carrito );
		Producto p1 = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
		
		
		
		carrito.agregarProducto(p1, 2);
		
		assertEquals(1, carrito.getProductos().size() );
		
	}
	@Test
	public void eliminarProductoDelCarrito() throws CarritoSinProductosException {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		CarritoDeCompras carrito = new CarritoDeCompras();
		Cliente c1 = new Cliente(1,"NOMBRE",20000.0, carrito );
		Producto p1 = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
		Producto p2 = new Electronico("Samsung2", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV2", 12);
		Producto p3 = new Electronico("Samsung3", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV3", 12);
		
		carrito.agregarProducto(p1, 4);
		carrito.agregarProducto(p2, 4);
		carrito.agregarProducto(p3, 4);
		carrito.sacarProducto(p2);
		
		assertEquals(2, carrito.getProductos().size());
		
	}
	@Test (expected = CarritoSinProductosException.class)
	public void eliminarProductoDelCarritoYQueTireUnaExcepcionDeCarritoVacio() throws CarritoSinProductosException {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		CarritoDeCompras carrito = new CarritoDeCompras();
		Cliente c1 = new Cliente(1,"NOMBRE",20000.0, carrito );
		Producto p2 = new Electronico("Samsung2", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV2", 12);

		
		carrito.sacarProducto(p2);
	}
	@Test
	public void dadoQueExisteUnCarritoCalcularElPrecioTotal() {
	    CarritoDeCompras carrito = new CarritoDeCompras();
	    Producto p1 = new Electronico("Samsung", 5, 1000.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
	    Producto p2 = new Ropa("Nike", 10, 500.0, "Negro", "Algodon", 42, TipoRopa.REMERA);

	    carrito.agregarProducto(p1, 2);
	    carrito.agregarProducto(p2, 1);

	    Double total = carrito.calcularTotal();

	    assertEquals(2500.0, total, 0.01);
	}
	@Test
	public void dadoQueExisteUnCarritoObtenerLosProductoQueEstenDentro() {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		CarritoDeCompras carrito = new CarritoDeCompras();
		Cliente c1 = new Cliente(1,"NOMBRE",20000.0, carrito );
		Producto p1 = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
		Producto p2 = new Electronico("Samsung2", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV2", 12);
		Producto p3 = new Electronico("Samsung3", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV3", 12);
		
		carrito.agregarProducto(p1, 4);
		carrito.agregarProducto(p2, 4);
		carrito.agregarProducto(p3, 4);
		
		assertEquals(3, carrito.obtenerUnaListaDeProductosDentroDelCarrito().size());
		
	}
	
	// TIENDA ONLINE
	@Test
	public void dadoQueExisteUnaTiendaAgregarUnCliente() {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		CarritoDeCompras carrito = new CarritoDeCompras();
		Cliente cliente = new Cliente(1, "Pepe", 10000.0, carrito);
		
		sistema.agregarCliente(cliente);
		
		assertEquals("Pepe", sistema.buscarClientePorCodigo(1).getNombre());
	}
	@Test
	public void dadoQueExistenClientesObtenerlosOrdenadosPorNombreAscendente() {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		Cliente cliente = new Cliente(1, "Pepe", 10000.0, null);
		Cliente cliente2 = new Cliente(2, "Alan", 10000.0, null);
		Cliente cliente3 = new Cliente(3, "Roman", 10000.0, null);
		Cliente cliente4 = new Cliente(4, "Pepe", 10000.0, null);
		Cliente cliente5 = new Cliente(5, "Jose", 10000.0, null);
		
		sistema.agregarCliente(cliente);
		sistema.agregarCliente(cliente2);
		sistema.agregarCliente(cliente3);
		sistema.agregarCliente(cliente4);
		sistema.agregarCliente(cliente5);
		
		TreeSet<Cliente> clientesOrdenadosPorNombreAsc = sistema.obtenerClientesPorNombreAscendente();
		
		int i = 0;

		for(Cliente c : clientesOrdenadosPorNombreAsc) {
			switch(i) {
				case 0:
					assertEquals("Alan", c.getNombre());
					break;
				case 1:
					assertEquals("Jose", c.getNombre());
					break;
				case 2:
					assertEquals("Pepe", c.getNombre());
					break;
				case 3:
					assertEquals("Pepe", c.getNombre());
					break;
				case 4:
					assertEquals("Roman", c.getNombre());
					break;
			}
			i++;
		}
	}
	@Test
	public void dadoQueExisteUnaTiendaAgregarUnProducto() {
	    SistemaTiendaOnline sistema = new SistemaTiendaOnline();

	    Producto producto = new Electronico(
	            "Samsung",
	            5,
	            700.0,
	            TipoElectronico.TELEVISOR,
	            "Smart TV",
	            12);

	    sistema.agregarProducto(producto);

	    assertTrue(sistema.obtenerCatalogoCompleto().contains(producto));
	}
	
	@Test
	public void dadoQueExisteUnaTiendaBuscarUnProductoPorSuCodigoCorrectamente() throws ProductoNoEncontradoException {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		Producto productoA = new Alimento("Matarazzo", 50, 75.0, TipoAlimento.PASTA, LocalDate.of(2028, 04, 18), 500);
		
		sistema.agregarProducto(productoA);
		
		Producto productoBuscado = sistema.buscarProductoPorCodigo(productoA.getCodigo());
		assertEquals(productoA, productoBuscado);
	}
	@Test
	public void dadoQueExistenUnaTiendaObtenerProductosOrdenadosPorMarcaAscendente() {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		Producto p1 = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);
		Producto p2 = new Electronico("Samsung2", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV2", 12);
		Producto p3 = new Electronico("Aamsung3", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV3", 12);
		Producto p4 = new Electronico("Samsung4", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV4", 12);
		Producto p5 = new Electronico("Zamsung5", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV5", 12);
		Producto p6 = new Electronico("Samsung6", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV6", 12);
		sistema.agregarProducto(p1);  //0
		sistema.agregarProducto(p2);  
		sistema.agregarProducto(p3);
		sistema.agregarProducto(p4);
		sistema.agregarProducto(p5);
		sistema.agregarProducto(p6);  // 5
		
		TreeSet<Producto> listaOrdenada = sistema.obtenerProductosOrdenadosPorMarcaAscendente();
		
		assertEquals(p3, listaOrdenada.first());
		assertEquals(p5, listaOrdenada.last());
		
	}	
	@Test
	public void dadoQueExistenUnaTiendaObtenerProductosOrdenadosPorPrecioUnitarioDescendente() {

	    SistemaTiendaOnline sistema = new SistemaTiendaOnline();

	    Producto p1 = new Electronico("Samsung", 5, 1000.0, TipoElectronico.TELEVISOR, "TV", 12);

	    Producto p2 = new Electronico("LG", 5, 5000.0, TipoElectronico.TELEVISOR, "TV", 12);

	    Producto p3 = new Electronico("Philips", 5, 3000.0,  TipoElectronico.TELEVISOR, "TV", 12);

	    sistema.agregarProducto(p1);
	    sistema.agregarProducto(p2);
	    sistema.agregarProducto(p3);

	    TreeSet<Producto> productos = sistema.obtenerProductosOrdenadosPorPrecioUnitarioDescendente();

	    assertEquals(p2, productos.first());
	    assertEquals(p1, productos.last());
	}

	@Test (expected = ProductoNoEncontradoException.class)
	public void dadoQueExisteUnaTiendaBuscarUnProductoPorSuCodigoYQueLanceUnaExcepcion() throws ProductoNoEncontradoException  {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
		Producto productoR = new Ropa("Levis", 6, 200.0, "AZUL","LANA" , 14, TipoRopa.REMERA);
		
		sistema.agregarProducto(productoR);
		
		Producto productoBuscado = sistema.buscarProductoPorCodigo(3);
		assertEquals(productoR, productoBuscado);
	}
	@Test
	public void dadoQueExisteUnaTiendaObtenerElCatalogoCompleto() {
	    SistemaTiendaOnline sistema = new SistemaTiendaOnline();

	    Producto p1 = new Electronico("Samsung", 5, 700.0, TipoElectronico.TELEVISOR, "Smart TV", 12);

	    Producto p2 = new Ropa("Nike", 10, 300.0, "Negro", "Algodón", 42, TipoRopa.REMERA);

	    sistema.agregarProducto(p1);
	    sistema.agregarProducto(p2);

	    TreeSet<Producto> catalogo = sistema.obtenerCatalogoCompleto();

	    assertEquals(2, catalogo.size());
	}
	@Test
	public void dadoQueExisteUnaTiendaRealizarUnaCompraCorrectamente() throws StockInsuficienteException, SaldoInsuficienteException {
	    SistemaTiendaOnline sistema = new SistemaTiendaOnline();
	    CarritoDeCompras carrito = new CarritoDeCompras();
	    Cliente cliente = new Cliente(1, "Santi", 10000.0, carrito);
	    Producto producto = new Electronico("Samsung", 5, 1000.0, TipoElectronico.TELEVISOR, "Smart TV", 12);

	    sistema.agregarCliente(cliente);
	    sistema.agregarProducto(producto);
	    carrito.agregarProducto(producto, 2);

	    sistema.realizarCompra(cliente);

	    assertEquals(8000.0, cliente.getDinero(), 0.01);
	}
	@Test
	public void dadoQueExisteUnaTiendaVerificarCantidadDeClientes() {
	    SistemaTiendaOnline sistema = new SistemaTiendaOnline();

	    Cliente c1 = new Cliente(1, "Juan", 1000.0, new CarritoDeCompras());
	    Cliente c2 = new Cliente(2, "Pedro", 2000.0, new CarritoDeCompras());

	    sistema.agregarCliente(c1);
	    sistema.agregarCliente(c2);

	    assertEquals(Integer.valueOf(2), sistema.obtenerCantidadDeClientes());
	}
	@Test
	public void dadoQueExisteUnaTiendaAplicarElDescuentoCorrespondienteALaRopa() {

	    Ropa ropa = new Ropa( "Nike", 10,1000.0,"Negro","Algodon",42,TipoRopa.REMERA);

	    Double precioConDescuento = ropa.aplicarDescuento();

	    assertEquals(Double.valueOf(800.0), precioConDescuento);
	}
	
	@Test(expected = StockInsuficienteException.class)
	public void dadoQueExisteUnaTiendaComprarUnProductoSinStockYLanzarExcepcion()
	        throws StockInsuficienteException, SaldoInsuficienteException {

	    SistemaTiendaOnline sistema = new SistemaTiendaOnline();

	    CarritoDeCompras carrito = new CarritoDeCompras();
	    Cliente cliente = new Cliente(1, "Santi", 10000.0, carrito);

	    Producto producto = new Electronico("Samsung",0,5000.0,TipoElectronico.TELEVISOR,"Smart TV",12);

	    sistema.agregarCliente(cliente);
	    sistema.agregarProducto(producto);

	    carrito.agregarProducto(producto, 1);

	    sistema.realizarCompra(cliente);
	}
	@Test (expected = SaldoInsuficienteException.class) 
	public void dadoQueExisteUnaTiendaYUnClienteRealizarUnaCompraConDineroInsuficienteYLanzarUnaException() throws StockInsuficienteException, SaldoInsuficienteException {
		SistemaTiendaOnline sistema = new SistemaTiendaOnline();
	    CarritoDeCompras carrito = new CarritoDeCompras();
	    Cliente cliente = new Cliente(1, "Santi", 500.0, carrito);
	    Producto producto = new Electronico("Samsung", 5, 1000.0, TipoElectronico.TELEVISOR, "Smart TV", 12);

	    sistema.agregarCliente(cliente);
	    sistema.agregarProducto(producto);
	    carrito.agregarProducto(producto, 2);

	    sistema.realizarCompra(cliente);
	}
	
	
	

}
