package ar.edu.unlam.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unlam.dominio.Alimento;
import ar.edu.unlam.dominio.Electronico;
import ar.edu.unlam.dominio.Producto;
import ar.edu.unlam.dominio.Ropa;
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
		
	}
	@Test
	public void dadoQueExisteUnAlimentoComprobarQueEstaVencido() {
		
	}
	
	@Test
	public void dadoQueExisteUnProductoEliminarloDelCatalogo() {
		
	}
	
	
	// CLIENTE
	@Test
	public void crearClienteCorrectamente() {
		
	}
	@Test
	public void DadoQueExisteUnClienteAsignarleUnCarritoCorrectamente() {
		
	}
	
	// CARRITO DE COMPRAS
	@Test 
	public void agregarProductoAlCarritoCorrectamente() {
		
	}
	@Test
	public void eliminarProductoDelCarrito() {
		
	}
	@Test (expected = CarritoSinProductosException.class)
	public void eliminarProductoDelCarritoYQueTireUnaExcepcionDeCarritoVacio() {
		
	}
	@Test
	public void dadoQueExisteUnCarritoCalcularElPrecioTotal() {
		
	}
	public void dadoQueExisteUnCarritoObtenerLosProductoQueEstenDentro() {
		
	}
	
	// TIENDA ONLINE
	@Test
	public void dadoQueExisteUnaTiendaAgregarUnCliente() {
		
	}
	
	@Test
	public void dadoQueExistenClientesObtenerlosOrdenadosPorNombreAscendente() {
		
	}
	@Test 
	public void dadoQueExisteUnaTiendaAgregarUnProducto() {
		
	}
	@Test
	public void dadoQueExisteUnaTiendaBuscarUnProductoPorSuCodigoCorrectamente() {
		
	}
	
	@Test
	public void dadoQueExistenUnaTiendaObtenerProductosOrdenadosPorMarcaAscendente() {
		
	}
	
	@Test
	public void dadoQueExistenUnaTiendaObtenerProductosOrdenadosPorPrecioUnitarioDescendente() {

	}
	@Test (expected = ProductoNoEncontradoException.class)
	public void dadoQueExisteUnaTiendaBuscarUnProductoPorSuCodigoYQueLanceUnaExcepcion() {
		
	}
	@Test
	public void dadoQueExisteUnaTiendaObtenerElCatalogoCompleto() {
		
	}
	@Test
	public void dadoQueExisteUnaTiendaRealizarUnaCompraCorrectamente() {
		
	}
	@Test
	public void dadoQueExisteUnaTiendaVerificarCantidadDeClientes() {
		
	}
	@Test
	public void dadoQueExisteUnaTiendaAplicarElDescuentoCorrespondienteALaRopa() {
		
	}
	@Test (expected = StockInsuficienteException.class)
	public void dadoQueExisteUnaTiendaComprarUnProductoSinStockYLanzarExcepcion() {
		
	}
	@Test (expected = SaldoInsuficienteException.class) 
	public void dadoQueExisteUnaTiendaYUnClienteRealizarUnaCompraConDineroInsuficienteYLanzarUnaException() {
		
	}
	
	
	

}
