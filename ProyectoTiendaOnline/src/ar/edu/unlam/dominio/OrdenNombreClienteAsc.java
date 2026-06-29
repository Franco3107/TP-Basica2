package ar.edu.unlam.dominio;

import java.util.Comparator;

public class OrdenNombreClienteAsc implements Comparator<Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		int resultado = o1.getNombre().compareTo(o2.getNombre());
		
		if(resultado == 0) {
			return o1.getCodigoCliente().compareTo(o2.getCodigoCliente());
		}
		return resultado;
	}

}
