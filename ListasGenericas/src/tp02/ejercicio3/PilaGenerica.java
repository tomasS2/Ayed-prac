package tp02.ejercicio3;

import tp02.ejercicio2.*;

public class PilaGenerica<T> {
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void apilar (T elem) {
		
		datos.agregarEn(elem, 1);
	}
	public T desApilar () {
		T elem = datos.elemento(1);
		datos.eliminarEn(1);
		return elem;	
	}
	public T tope() {
		return datos.elemento(1);	
	}
	public boolean esVacia() {
		return (datos.esVacia());
	}
}
