package ar.edu.unlam.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import ar.edu.unlam.dominio.Alimento;
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
		//ggf
	}
	@Test
	public void dadoQueExisteUnAlimentoComprobarQueEstaVencido() {
		//hdfh
	}
	
	@Test
	public void dadoQueExisteUnProductoEliminarloDelCatalogo() {
		SistemaTiendaOnline sis1 = new SistemaTiendaOnline();
		Ropa r1 = new Ropa("marca", 20 , 10000.0,"ROJO" , "Material", 4, TipoRopa.BUZO);
		Alimento a1 = new Alimento("Marca", 10, 100.0, TipoAlimento.ARROZ, LocalDate.of(2026, 10, 10), 2);
		Electronico e1 = new Electronico("Fravega",10, 5000.0,TipoElectronico.AIRE_ACONDICIONADO, "A348F",12);
		sis1.agregarProducto(r1);
		
	    
		
	}
	
	
	// CLIENTE
	@Test
	public void crearClienteCorrectamente() {
		//s
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
		//FFd
	}
	public void dadoQueExisteUnCarritoObtenerLosProductoQueEstenDentro() {
		
	}
	
	// TIENDA ONLINE
	@Test
	public void dadoQueExisteUnaTiendaAgregarUnCliente() {
		//d
	}
	@Test
	public void dadoQueExistenClientesObtenerlosOrdenadosPorNombreAscendente() {
		//7
	}
	@Test 
	public void dadoQueExisteUnaTiendaAgregarUnProducto() {
		
	}
	@Test
	public void dadoQueExisteUnaTiendaBuscarUnProductoPorSuCodigoCorrectamente() {
		//f
	}
	@Test
	public void dadoQueExistenUnaTiendaObtenerProductosOrdenadosPorMarcaAscendente() {
		
	}	
	@Test
	public void dadoQueExistenUnaTiendaObtenerProductosOrdenadosPorPrecioUnitarioDescendente() {

	}

	@Test (expected = ProductoNoEncontradoException.class)
	public void dadoQueExisteUnaTiendaBuscarUnProductoPorSuCodigoYQueLanceUnaExcepcion() {
		//H
	}
	@Test
	public void dadoQueExisteUnaTiendaObtenerElCatalogoCompleto() {
		//gf
	}
	@Test
	public void dadoQueExisteUnaTiendaRealizarUnaCompraCorrectamente() {
		//Hhg
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
