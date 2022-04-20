package tp03.ejercicio1;



public class ProbarArbol {

	public static void imprimirArbol (ArbolBinario<Integer> arbol) {
		System.out.println(arbol.getDato());
		if (arbol.tieneHijoIzquierdo()) {
			imprimirArbol(arbol.getHijoIzquierdo());
		}
		if (arbol.tieneHijoDerecho()) {
			imprimirArbol(arbol.getHijoDerecho());
		}
	}

	public static void main(String[] args) {
		ArbolBinario<Integer> a1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> a3 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> a4 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> a7 = new ArbolBinario<Integer>(7);
		ArbolBinario<Integer> a8 = new ArbolBinario<Integer>(8);
		
		
		a1.agregarHijoIzquierdo(a2);
		a1.agregarHijoDerecho(a3);
		a2.agregarHijoIzquierdo(a4);
		a2.agregarHijoDerecho(a5);
		a3.agregarHijoIzquierdo(a6);
		
		a1.entreNiveles(1,2);
		//System.out.println("arbol espejo");
		//System.out.println(a1.contarHojas());
		//System.out.println(a1.hojaMasLejana());
		//a1.espejo();
		
	}

}
