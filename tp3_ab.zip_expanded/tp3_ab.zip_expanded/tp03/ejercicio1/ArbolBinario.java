package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

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

	
	
	public int hojaMasLejana() {
		ListaGenerica <T> listaMax = new ListaEnlazadaGenerica<T>();
		ListaGenerica <T> listaAux = new ListaEnlazadaGenerica<T>();
		
		if (!this.esVacio()) {
			calcMasLejana(listaMax, listaAux);
		}
		return listaMax.tamanio();
	}
	private void calcMasLejana(ListaGenerica <T> listaMax, ListaGenerica <T> listaAux) {

		listaAux.agregarFinal(getDato());
		if (this.esHoja()) {
			if (listaAux.tamanio() > listaMax.tamanio()) {
				//borrar los elementos de la lista maximo 
				listaMax.comenzar();
				while (!listaMax.fin()) {
					listaMax.eliminar(listaMax.proximo());
				}
				listaAux.comenzar();
				//actualizar la lista maximo con la auxiliar recientemente generada
				while (!listaAux.fin()) {
					listaMax.agregarFinal(listaAux.proximo());
				}
				 
			}
		}else {
			if (this.tieneHijoIzquierdo()) {
				getHijoIzquierdo().calcMasLejana(listaMax, listaAux);
			}
			if (this.tieneHijoDerecho()) {
				getHijoDerecho().calcMasLejana(listaMax, listaAux);
			}
		}
		listaAux.eliminarEn(listaAux.tamanio());
	
	}
	
	
	
	public int contarHojas() {
		int cont = 0;
		if (this.esVacio()) {
			return -1;
		}
			
		if (this.esHoja()) {
			return 1;
		}else {
			if (this.tieneHijoIzquierdo()) {
				
				
				cont += getHijoIzquierdo().contarHojas();
			}
			if (this.tieneHijoDerecho()) {
				
				cont += getHijoDerecho().contarHojas();
				
				
			}
		}
		return cont;
}
	
	
	
    public ArbolBinario<T> espejo() {
		if (this.esVacio()) {
			return null;
		}		
		ArbolBinario<T> temp = this.getHijoDerecho();
		this.agregarHijoDerecho(this.getHijoIzquierdo());
		this.agregarHijoIzquierdo(temp);
		
		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().espejo();
			
		}
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().espejo();
		}
		return this;
    }
    
		
			
	


	public void entreNiveles(int n, int m){
		ArbolBinario <T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		while((!cola.esVacia()) && (n<=m)) {
			
			arbol = cola.desEncolar();
			if (arbol != null) {
				
				System.out.println(arbol.getDato());
				if (arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
				if (arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
				}
			}else {
				if (!cola.esVacia()) {
					System.out.println();
					cola.encolar(null);
					n++;
				}
			}
		} 
		
	}

	

}
