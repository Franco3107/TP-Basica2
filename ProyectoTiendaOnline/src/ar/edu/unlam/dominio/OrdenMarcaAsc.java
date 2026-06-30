package ar.edu.unlam.dominio;

import java.util.Comparator;

public class OrdenMarcaAsc implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		int Lista = o1.getMarca().compareTo(o2.getMarca());
		
		if(Lista == 0) {
			return o1.getCodigo().compareTo(o2.getCodigo());
		}
		return Lista;
	}

}
