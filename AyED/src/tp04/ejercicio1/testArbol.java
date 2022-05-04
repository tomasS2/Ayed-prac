package tp04.ejercicio1;

import tp02.ejercicio2.*;

public class testArbol {

	public static void main(String[] args) {

		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(10);

		a.agregarHijo(b);
		b.agregarHijo(c);
		b.agregarHijo(e);
		c.agregarHijo(d);
		c.agregarHijo(g);
		c.agregarHijo(h);

//		System.out.println(a.altura());
//		System.out.println(a.nivel(5));
//		System.out.println(a.ancho());
		if (a.esAncestro(6, 3)) {
			System.out.println("es");
		} else {
			System.out.println("no es");
		}
	}
}
