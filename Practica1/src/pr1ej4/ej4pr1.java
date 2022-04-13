//4 Qué imprime el siguiente programa al ejecutar main?
//		a. Intente averiguarlo sin ejecutar el programa en su computadora.
//		b. Ejecute el ejercicio en su computadora, y compare su resultado con lo
//		esperado en el inciso anterior.
//		c. Inserte un breakpoint en las lineas donde se indica: y = tmp y ejecute en
//		modo debug ¿los valores que adoptan las variables x, y coinciden con los
//		valores impresos por consola?	

package pr1ej4;

public class ej4pr1 {

	public static void main(String[] args) {

		int a = 1, b = 2;
		Integer c = 3, d = 4;
		SwapValores.swap1(a, b);
		SwapValores.swap2(c, d);
		System.out.println("a=" + a + " b=" + b);//imprime a=1 b=2 porque se envian como parametros por valor.
		System.out.println("c=" + c + " d=" + d);//imprime c=3 d=4 
	}

}
