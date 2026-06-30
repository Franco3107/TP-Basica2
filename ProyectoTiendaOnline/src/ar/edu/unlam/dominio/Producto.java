package ar.edu.unlam.dominio;

import java.util.Objects;

public abstract class Producto implements Comparable<Producto> {
	private static Integer contadorCodigo = 0; // Se comparte entre todos los productos creados

	private Integer codigo; // CODIGO INDIVIDUAL DE CADA PRODUCTO
	private String marca;
	private Integer cantidadDeStock;
	private Double precio;

	public Producto(String marca, Integer cantidadDeStock, Double precio) {
		this.codigo = ++contadorCodigo;
		this.marca = marca;
		this.cantidadDeStock = cantidadDeStock;
		this.precio = precio;
	}

	public void agregarStock() {
		this.cantidadDeStock++;
	}

	public void quitarStock() {
		this.cantidadDeStock--;
	}

	public Boolean hayStock() {
		return cantidadDeStock > 0;
	}

// GETTER AND SETTER
	public Integer getCodigo() {
		return codigo;
	}
	

public String getMarca() {
		return marca;
	}

	// toString
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", marca=" + marca + ", cantidadDeStock=" + cantidadDeStock + ", precio="
				+ precio + "]";
	}
// HASH CODE Y EQUALS


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}

// COMPARATE T0
	@Override
	public int compareTo(Producto otro) {
		return this.codigo.compareTo(otro.codigo);
	}


}
