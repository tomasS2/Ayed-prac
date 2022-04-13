// Escriba una clase llamada TestListaDeEnterosEnlazada que reciba en su m�todo
//main una secuencia de n�meros, los agregue a un objeto de tipo
//ListaDeEnterosEnlazada y luego imprima los elementos de dicha lista.

//1.4 Escriba un m�todo recursivo que imprima los elementos de una lista en sentido inverso.
//La lista la recibe por par�metro.

package pr2ej1;

import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {
	//ejer 1.4
	public static void imprimirRecursivo(ListaDeEnterosEnlazada lista) {
		
		if (!lista.fin()){
			int x = lista.proximo();
			imprimirRecursivo(lista);
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		for (int i = 0; i < args.length; i++) {
			Integer x = Integer.parseInt(args[i]);
			lista.agregarFinal(x);
		}
		//to string
		System.out.println(lista.toString());

		// usando metodos
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}
		System.out.println("IMPRIMIR RECURSIVO INVERSO");
		lista.comenzar();
		imprimirRecursivo(lista);
		
	
	}
	
	
	

}
