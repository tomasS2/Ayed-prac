//Escriba un programa recursivo que, a partir de un número n, devuelva una lista con
//cada miembro de la sucesión (la suce. la da el enunciado.).

package pr2ej1;

import tp02.ejercicio1.*;

public class ej1_6pr1 {

	private ListaDeEnterosEnlazada listaDevuelve = new ListaDeEnterosEnlazada();

	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		if (n != 1) {
			listaDevuelve.agregarFinal(n);
			if ((n % 2) == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			if (n == 1) {
				listaDevuelve.agregarFinal(n);
			}
			calcularSucesion(n);
		}

		return listaDevuelve;
	}

	public static void main(String[] args) {
		ej1_6pr1 f = new ej1_6pr1();
		ListaDeEnterosEnlazada lista = f.calcularSucesion(6);
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo());
		}

	}

}
