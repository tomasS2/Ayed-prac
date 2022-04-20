package tp03.ejercicio1;

import tp02.ejercicio2.*;
import tp03.ejercicio1.*;

public class ContadorArbol {
	private ArbolBinario <Integer> arbol;
	
	public ContadorArbol (ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	
	public ListaGenerica<Integer> numerosPares() {
		ListaGenerica <Integer> listaPares = new ListaEnlazadaGenerica<Integer>();
		int n = 2;
		if (!this.arbol.esVacio()) {	
			if (n == 1) {
				numerosParesInOrden(this.arbol,listaPares);
			}else {
				numerosParesPosOrden(this.arbol,listaPares);
			}
		}
		return listaPares;
			
	}
	
	private void numerosParesInOrden(ArbolBinario <Integer> arbol,ListaGenerica<Integer> listaPares) {
		
		if (this.arbol.tieneHijoIzquierdo()) {
			numerosParesInOrden(this.arbol.getHijoIzquierdo(),listaPares);
		}
		if ((this.arbol.getDato() % 2) == 0) {
			listaPares.agregarFinal(this.arbol.getDato());
		}
		if (this.arbol.tieneHijoDerecho()) {
			numerosParesInOrden(this.arbol.getHijoDerecho(),listaPares);
		}
		
	}
	private void numerosParesPosOrden(ArbolBinario <Integer> arbol,ListaGenerica<Integer> listaPares) {
		
		if (this.arbol.tieneHijoIzquierdo()) {
			numerosParesPosOrden(this.arbol.getHijoIzquierdo(),listaPares);
		}
		
		if (this.arbol.tieneHijoDerecho()) {
			numerosParesPosOrden(this.arbol.getHijoDerecho(),listaPares);
		}
		if ((this.arbol.getDato() % 2) == 0) {
			listaPares.agregarFinal(this.arbol.getDato());
		}
		
	}
	
}
