package tp02.ejercicio4;

public class PruebaBalanceo {

	public static void main(String[] args) {
		TestBalanceo t = new TestBalanceo();
		String cadena = "{()}";

		if (t.esBalanceado(cadena)) {
			System.out.println("Esta balanceado");
		} else {
			System.out.println("No está balanceado");
		}
		
		
	}

}
