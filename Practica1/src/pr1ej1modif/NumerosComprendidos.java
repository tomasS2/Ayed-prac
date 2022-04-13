
package pr1ej1modif;

public class NumerosComprendidos {

	public static void imprimirContenidoABFor(int a, int b) {
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}else {
			for (int i = a; i >= b; i--) {
				System.out.println(i);
			}
		}
		
	}

	public static void imprimirContenidoABWhile(int a, int b) {
		if (a < b) {
			while (a <= b) {
				System.out.println(a);
				a++;
			}
		}else{
			while (b <= a) {
				System.out.println(b);
				b++;
			}
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

