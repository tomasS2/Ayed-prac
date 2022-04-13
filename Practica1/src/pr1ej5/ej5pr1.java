//5. Dado un arreglo de valores tipo int se desea calcular el valor máximo, mínimo, y
//promedio en un único método. Escriba tres métodos de clase, donde respectivamente:
//a. Devuelva lo pedido por el mecanismo de retorno de un método en Java
//("return").
//b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede
//ser de tipo arreglo).
//c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".

package pr1ej5;

public class ej5pr1 {

	public static void main(String[] args) {
		int[] arreglo= {1,2,3,4,5,6};
		//a
		Datos datos1=Operaciones.devolverReturn(arreglo);
		System.out.println("PTO A");
		System.out.println(datos1.toString());
//		System.out.println(datos1.getMax());
//		System.out.println(datos1.getMin());
//		System.out.println(datos1.getProm());		
		
		
		//b
		Datos datos2 = new Datos();
		Operaciones.devolverParametro(arreglo, datos2);
		System.out.println("PTO B");
		System.out.println(datos2.toString());
//		System.out.println(datos2.getMax());
//		System.out.println(datos2.getMin());
//		System.out.println(datos2.getProm());
		
		
		//c
		//incorrecto
		Operaciones.devolverSinParametro(arreglo);
	}

}
