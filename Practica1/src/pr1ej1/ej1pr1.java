//1. Escriba tres métodos de clase (static) que reciban por parámetro dos números
//enteros (tipo int) a y b e impriman todos los números enteros comprendidos entre
//a; b (inclusive), uno por cada línea en la salida estándar. Para ello, dentro de una
//nueva clase escriba un método por cada uno de los siguientes incisos:
//a. Que realice lo pedido con un for.
//b. Que realice lo pedido con un while.
//c. Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do while).

package pr1ej1;

public class ej1pr1 {

	public static void main(String[] args) {

		int aux, n1, n2;
		//valores de ejemplo
		n1 = 4;
		n1 = 12;
		n2 = 10;
		if (n1 > n2) {
		//intercambio para no tener problema en los modulos.
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		NumerosComprendidos.imprimirContenidoABFor(n1, n2);
		NumerosComprendidos.imprimirContenidoABWhile(n1, n2);
		NumerosComprendidos.imprimirContenidoABRecursion(n1, n2);

	}

}