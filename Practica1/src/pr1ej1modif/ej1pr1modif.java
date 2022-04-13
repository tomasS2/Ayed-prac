//1. Escriba tres m�todos de clase (static) que reciban por par�metro dos n�meros
//enteros (tipo int) a y b e impriman todos los n�meros enteros comprendidos entre
//a; b (inclusive), uno por cada l�nea en la salida est�ndar. Para ello, dentro de una
//nueva clase escriba un m�todo por cada uno de los siguientes incisos:
//a. Que realice lo pedido con un for.
//b. Que realice lo pedido con un while.
//c. Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do while).

package pr1ej1modif;

public class ej1pr1modif {

	public static void main(String[] args) {

		int auxN1, auxN2, n1, n2;
		n1 = 13;
		n2 = 10;

		NumerosComprendidos.imprimirContenidoABFor(n1, n2);
		NumerosComprendidos.imprimirContenidoABWhile(n1, n2);

		if (n1 >= n2) {
			auxN1 = n2;
			auxN2 = n1;
			NumerosComprendidos.imprimirContenidoABRecursion(auxN1, auxN2);
		} else {
			NumerosComprendidos.imprimirContenidoABRecursion(n1, n2);
		}

	}

}
