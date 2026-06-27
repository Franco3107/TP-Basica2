package ar.edu.unlam.dominio;

public abstract class Producto {
	private Integer codigo;
	private String nombre;
	private Integer cantidadDeStock;
	
	
	
public Producto(Integer codigo, String nombre,  Integer cantidadDeStock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadDeStock = cantidadDeStock;
		}

public void agregarStock() {
	this.cantidadDeStock++;
}
public void quitarStock() {
	this.cantidadDeStock--;
}
public Boolean hayStock() {
	return cantidadDeStock >0;
}

// GETTER AND SETTER

}

