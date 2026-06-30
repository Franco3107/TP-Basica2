package ar.edu.unlam.dominio;

import java.util.Comparator;

public class OrdenPrecioDesc implements Comparator<Producto> {

    @Override
    public int compare(Producto p1, Producto p2) {

        int comparacion = p2.getPrecio().compareTo(p1.getPrecio());

        if (comparacion == 0) {
            return p1.getCodigo().compareTo(p2.getCodigo());
        }

        return comparacion;
    }
    
    
}