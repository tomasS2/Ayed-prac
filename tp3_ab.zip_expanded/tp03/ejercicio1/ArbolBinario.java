package tp03.ejercicio1;

import tp02.ejercicio2.*;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		return 0;
	}
	
	public ListaGenerica hojaMasLejana() {
		ListaGenerica <T> listaMax = new ListaEnlazadaGenerica<T>();
		ListaGenerica <T> listaAux = new ListaEnlazadaGenerica<T>();
		
		if (!this.esVacio()) {
			calcMasLejana(listaMax, listaAux);
		}
		return listaMax;
	}
	private ListaGenerica calcMasLejana(ListaGenerica <T> listaMax, ListaGenerica <T> listaAux) {
		listaAux.agregarFinal(getDato());
		if (esHoja()) {
			if (listaAux.tamanio() > listaMax.tamanio()) {
				
				borrar los elementos de la lista maximo y con un while actualizar a mano la lista maximo con la auxiliar recientemente generaada
				
			}
		}else {
			if (tieneHijoIzquierdo()) {
				calcMasLejana(listaMax, listaAux);
			}
			if (tieneHijoDerecho()) {
				calcMasLejana(listaMax, listaAux);
			}
		}
		listaAux.eliminarEn(listaAux.tamanio());
		
	}
	
	

    public ArbolBinario<T> espejo() {
		
		return null;
	}


	public void entreNiveles(int n, int m){
		
	}

	

}
