package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	private ArbolBinario <Integer> arbol;
	private int max = -1;
	
	
	public RedBinariaLlena (ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
		
	}
	
	
	public int retardoReenvio(ArbolBinario<Integer> arbol) {
		Integer cont = 0;
		calcRetardo (cont,this.arbol);
		return max;
	}
	
	
	private void calcRetardo (Integer cont, ArbolBinario <Integer> a ) {
		cont = cont + a.getDato();
		if (a.esHoja()) {
			if (cont > this.max) {
				this.max = cont;
			}	
		}else {
			if (a.tieneHijoIzquierdo()) {
				calcRetardo(cont, a.getHijoIzquierdo());
			}
			
			if (a.tieneHijoDerecho()) {
				calcRetardo(cont, a.getHijoDerecho());
			}
		}
		
	}
	
}
