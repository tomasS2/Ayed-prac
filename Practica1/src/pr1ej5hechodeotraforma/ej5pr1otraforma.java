package pr1ej5hechodeotraforma;


public class ej5pr1otraforma {

	// a. Devuelva lo pedido por el mecanismo de retorno de un método en Java
	// ("return").
	public static Datos devolverReturn(int arreglo[]) {//tambien se podria hacer retornando un vector
		int max = -1;
		int min = 999;
		int sumador = 0;
	

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < min) {
				min = arreglo[i];
			}
			if (arreglo[i] > max) {
				max = arreglo[i];
			}
			sumador = sumador + arreglo[i];
		}
		double prom = (double) sumador / arreglo.length;

		Datos datos = new Datos();
		datos.setMax(max);
		datos.setMin(min);
		datos.setProm(prom);
		return datos;
	}

	// Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede
	// ser de tipo arreglo).
	public static void devolverParametro(int arreglo[], Datos datos) {
		int max = -1;
		int min = 999;
		int sumador = 0;

		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] < min) {
				min = arreglo[i];
			}
			if (arreglo[i] > max) {
				max = arreglo[i];
			}
			
			sumador = sumador + arreglo[i];
		}
		double prom;
		prom = (double) sumador / arreglo.length;
		datos.setMax(max);
		datos.setMin(min);
		datos.setProm(prom);

	}

	//c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".
	
	public static void devolverSinParametro (int arreglo[]) {
		int max=-1;
		int min=999;
		int sumador=0;
		
		for (int i=0;i<arreglo.length;i++) {
			if (arreglo[i]<min) {
				min=arreglo[i];
			}
			if (arreglo[i]>max) {
				max=arreglo[i];
			}
			sumador=sumador+arreglo[i];
		}		
		double prom= (double)sumador/arreglo.length;
		System.out.println("PTO C");
		System.out.println(max);
		System.out.println(min);
		System.out.println(prom);
		
	}
	public static void main(String[] args) {
		int[] arreglo= {1,2,3,4,5,6};
		//a
		Datos datos1=devolverReturn(arreglo);
		System.out.println("PTO A");
		System.out.println(datos1.toString());
//		System.out.println(datos1.getMax());
//		System.out.println(datos1.getMin());
//		System.out.println(datos1.getProm());	
		
		//b
		Datos datos2 = new Datos();
		devolverParametro(arreglo, datos2);
		System.out.println("PTO B");
		System.out.println(datos2.toString());
//		System.out.println(datos2.getMax());
//		System.out.println(datos2.getMin());
//		System.out.println(datos2.getProm());
		
		//c
		//incorrecto
		devolverSinParametro(arreglo);
		
	}

}
