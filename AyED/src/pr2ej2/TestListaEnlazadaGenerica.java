// Escriba una clase llamada TestListaEnlazadaGenerica que cree 4 objetos de tipo
//Estudiante (implementado en el TP01B) y los agregue a un objeto de tipo
//ListaEnlazadaGenerica usando los diferentes métodos de la lista y luego, imprima los
//elementos de dicha lista usando el método tusDatos().


package pr2ej2;

import tp02.ejercicio2.*;


public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		Estudiante aEstudiantes[] = new Estudiante [4];
		aEstudiantes[0]=new Estudiante();
		aEstudiantes[0].setNombre("tomas");
		aEstudiantes[0].setApellido("gomez");
		aEstudiantes[0].setComision("3");
		aEstudiantes[0].setDireccion("23 entre 32");
		aEstudiantes[0].setMail("pepepe gmail");
		
		aEstudiantes[1]=new Estudiante();
		aEstudiantes[1].setNombre("jorfe");
		aEstudiantes[1].setApellido("pere");
		aEstudiantes[1].setComision("2");
		aEstudiantes[1].setDireccion("59 entre 4");
		aEstudiantes[1].setMail("jorfe gmail");
		
		aEstudiantes[2]=new Estudiante();
		aEstudiantes[2].setNombre("martin");
		aEstudiantes[2].setApellido("jonas");
		aEstudiantes[2].setComision("5");
		aEstudiantes[2].setDireccion("54 entre 30");
		aEstudiantes[2].setMail("martin gmail");
		
		aEstudiantes[3]=new Estudiante();
		aEstudiantes[3].setNombre("franco");
		aEstudiantes[3].setApellido("loeptez");
		aEstudiantes[3].setComision("1");
		aEstudiantes[3].setDireccion("6 entre 4");
		aEstudiantes[3].setMail("frac gmail");
		
		ListaEnlazadaGenerica<Estudiante> lista = new  ListaEnlazadaGenerica<Estudiante>();
		
		for (int i = 0; i < aEstudiantes.length; i++) {
			lista.agregarFinal(aEstudiantes[i]);
		}
		lista.comenzar();
		while (!lista.fin()) {
			System.out.print(lista.proximo().tusDatos());
			System.out.print("\n");
		}
		
	}
		
}
