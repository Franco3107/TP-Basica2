package ar.edu.unlam.dominio;

public abstract class Producto {
	private static Integer CONTADOR_CODIGO =0;  // Se comparte entre todos los productos creados
	
	private Integer codigo; // CODIGO INDIVIDUAL DE CADA PRODUCTO
	private String marca;
	private Integer cantidadDeStock;
	
	
	
public Producto(String marca,  Integer cantidadDeStock) {
		this.codigo = ++CONTADOR_CODIGO;
		this.marca = marca;
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

// toString
@Override
public String toString() {
	return "Producto [codigo=" + codigo + ", nombre=" + marca + ", cantidadDeStock=" + cantidadDeStock + "]";
}


}

