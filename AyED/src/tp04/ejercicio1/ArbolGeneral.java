package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos == null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}

	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}

	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo))
				hijos.eliminar(hijo);
		}
	}

	public ListaEnlazadaGenerica<Integer> preOrdenImpMayorQue(int n, ArbolGeneral<Integer> a) {
		ListaEnlazadaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		preImpMayorQue(lis, n, a);
		return lis;
	}

	private void preImpMayorQue(ListaEnlazadaGenerica<Integer> l, int n, ArbolGeneral<Integer> a) {
		if ((a.getDato() % 2 == 1) && (a.getDato() > n)) {
			l.agregarFinal(a.getDato());
		}
		ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
		lHijos.comenzar();
		while (!lHijos.fin()) {
			(lHijos.proximo()).preImpMayorQue(l, n, a);
		}
	}

	public ListaEnlazadaGenerica<Integer> posOrdenImpMayorQue(int n, ArbolGeneral<Integer> a) {
		ListaEnlazadaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		posImpMayorQue(lis, n, a);
		return lis;
	}

	private void posImpMayorQue(ListaEnlazadaGenerica<Integer> l, int n, ArbolGeneral<Integer> a) {

		ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
		lHijos.comenzar();
		while (!lHijos.fin()) {
			(lHijos.proximo()).posImpMayorQue(l, n, a);
		}
		if ((a.getDato() % 2 == 1) && (a.getDato() > n)) {
			l.agregarFinal(a.getDato());
		}
	}

	public ListaEnlazadaGenerica<Integer> inOrdenImpMayorQue(int n, ArbolGeneral<Integer> a) {
		ListaEnlazadaGenerica<Integer> lis = new ListaEnlazadaGenerica<Integer>();
		inImpMayorQue(lis, n, a);
		return lis;
	}

	private void inImpMayorQue(ListaEnlazadaGenerica<Integer> l, int n, ArbolGeneral<Integer> a) {

		ListaGenerica<ArbolGeneral<Integer>> lHijos = a.getHijos();
		lHijos.comenzar();
		if (!lHijos.esVacia()) {// hijo izq
			(lHijos.proximo()).inImpMayorQue(l, n, a);
		}
		if ((a.getDato() % 2 == 1) && (a.getDato() > n)) {
			l.agregarFinal(a.getDato());
		}
		while (!lHijos.fin()) {
			(lHijos.proximo()).inImpMayorQue(l, n, a);
		}
	}

	public ListaGenerica<Integer> porNiveles(ArbolGeneral<Integer> arbol, int n) {
		ListaGenerica<Integer> result = new ListaEnlazadaGenerica<Integer>();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> arbol_aux;
		cola.encolar(arbol);
		while (!cola.esVacia()) {
			arbol_aux = cola.desencolar();
			if ((arbol_aux.getDato() % 2 == 1) && (arbol_aux.getDato() > n)) {
				result.agregarFinal(arbol_aux.getDato());
			}
			if (arbol_aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = arbol_aux.getHijos();
				hijos.comenzar();
				while (!hijos.fin()) {
					cola.encolar(hijos.proximo());
				}
			}
		}
		return result;
	}

//	public int altura(): int devuelve la altura del árbol, es decir, la longitud del camino más largo
//	desde el nodo raíz hasta una hoja.
	public Integer altura() {
		Integer altura = -1;

		if (this.esHoja()) {
			return 0;
		} else {
			ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();
			lHijos.comenzar();
			if (!lHijos.fin()) {
				altura = Math.max(altura, lHijos.proximo().altura());
			}

		}
		return altura + 1;

	}

	public Integer nivel(T dato) {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> arbol_aux;
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 0;

		while (!cola.esVacia()) {
			arbol_aux = cola.desencolar();
			if (arbol_aux != null) {
				if (arbol_aux.getDato() == dato) {
					return nivel;
				}
				if (arbol_aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			} else {
				if (!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}
			}
		}

		return -1;
	}

	public Integer ancho() {
		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
		ArbolGeneral<T> arbol_aux;
		cola.encolar(this);
		cola.encolar(null);
		int ancho = 0;
		int ancho_max = -999;

		while (!cola.esVacia()) {
			arbol_aux = cola.desencolar();
			if (arbol_aux != null) {
				ancho++;

				if (arbol_aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			} else {
				if (!cola.esVacia()) {
					cola.encolar(null);

				}
				// se hace afuera del if anterior porque la cola esta vacia, entonces no encola
				// el null y se termina toda la ejecucion (en el ultimo caso).
				if (ancho > ancho_max) {
					ancho_max = ancho;
				}
				ancho = 0;
			}
		}

		return ancho_max;
	}
	
	
	public void clonar(ListaGenerica<T> origen, ListaGenerica<T> destino) {
		origen.comenzar();
		while (!origen.fin()) {
			destino.agregarFinal(origen.proximo()); 
		}
	}
	
	//devuelve true si el valor a es ancestro del valor b. 
	public Boolean esAncestro(T a, T b) {
		ListaGenerica<T> camino = new ListaEnlazadaGenerica<T>();
		ListaGenerica<T> lista = new ListaEnlazadaGenerica<T>();
		lista.agregarInicio(this.getDato());
		buscarAncestro(this,b,camino,lista);
		camino.comenzar();
		return camino.incluye(a) && camino.incluye(b);
		
	}
	
	private void buscarAncestro(ArbolGeneral<T> arbol,T b,ListaGenerica<T> camino,ListaGenerica<T> lista) {
		T dato = arbol.getDato();
		if (dato == b) {
			clonar(lista,camino);
		}
		if (camino.esVacia()) {
			ListaGenerica<ArbolGeneral<T>> hijos = arbol.getHijos();
			hijos.comenzar();
			while ((!hijos.fin())&& camino.esVacia()) {
				ArbolGeneral<T> aux = hijos.proximo(); 
				lista.agregarFinal(aux.getDato());
				buscarAncestro(aux, b, camino, lista);
				lista.eliminarEn(lista.tamanio());
			}			
		}
	}
}