package pr1ej4;

public class SwapValores {
	public static void swap1(int x, int y) {
		//si x es menor a y se intercambian los valores. fuera del modulo no se ve la modificacion.
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
	}

	public static void swap2(Integer x, Integer y) {
		//si x es menor y se crea una nueva referencia y se guarda el valor intercambiado. al salir del modulo no todo sigue igual que antes de entrar.
		if (x < y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		//System.out.println(x+" "+ y);//lo agregue para ver que hacia.
	}



}
