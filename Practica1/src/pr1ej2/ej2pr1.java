//2. Escriba un m�todo de clase que dado un n�mero n devuelva un nuevo arreglo de
//tama�o n con los n primeros m�ltiplos enteros de n mayores o iguales que 1.
//Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k}
//Agregue al programa la posibilidad de probar con distintos valores de n
//ingres�ndolos por teclado, mediante el uso de System.in. La clase Scanner permite
//leer de forma sencilla valores de entrada.


package pr1ej2;

import java.util.Scanner;

public class ej2pr1 {

	public static void main(String[] args) {
		int arreglo[]=GeneraArreglo.devolverArreglo();
		for (int i=0; i<arreglo.length;i++) {
			System.out.println(arreglo[i]);
			
		}
	}

}
