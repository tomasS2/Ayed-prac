// Escriba una clase llamada TestListaDeEnterosConArreglos que reciba en su método
//main una secuencia de números, los agregue a un objeto de tipo
//ListaDeEnterosConArreglos y luego imprima los elementos de dicha lista.

//1.4 Escriba un método recursivo que imprima los elementos de una lista en sentido inverso.
//La lista la recibe por parámetro.
package pr2ej1;

import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {
	// ejer 1.4
	public static void imprimirRecursivo(ListaDeEnterosConArreglos lista) {

		if (!lista.fin()) {
			int x = lista.proximo();
			imprimirRecursivo(lista);
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();

		for (int i = 0; i < args.length; i++) {
			Integer x = Integer.parseInt(args[i]);
			lista.agregarFinal(x);
		}
		// usando metodos
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}

		System.out.println("orden inverso recursion");
		lista.comenzar();
		imprimirRecursivo(lista);

	}

}
