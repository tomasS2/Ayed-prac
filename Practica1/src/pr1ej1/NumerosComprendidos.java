package pr1ej1;

public class NumerosComprendidos {

	public static void imprimirContenidoABFor(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

	public static void imprimirContenidoABWhile(int a, int b) {

		while (a <= b) {
			System.out.println(a);
			a++;
		}
	}

	public static void imprimirContenidoABRecursion(int a, int b) {

		if (a <= b) {
			System.out.println(a);
			a++;
			NumerosComprendidos.imprimirContenidoABRecursion(a, b);
		}
	}

}