package tp04.ejercicio7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotable<T> {
	private ArbolGeneral<T> red;
//	private double cau;
//	private double min;
	
	public RedDeAguaPotable (ArbolGeneral<T> red) {
		this.red = red;	
	}
	
//	public double minimoCaudal(double caudal) {
//		ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
//		ArbolGeneral<T> arbol_aux;
//		double cant_nodos = 0;
//		double caudal_min = 999;
//		double caudal_act = 0; //MMmmMMm
//		
//		cola.encolar(this.red);
//		cola.encolar(null);
//		while (!cola.esVacia()) {
//			arbol_aux = cola.desencolar();
//			if (arbol_aux != null) {
//				cant_nodos++;
//				if (arbol_aux.tieneHijos()) {
//					ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
//					hijos.comenzar();
//					while (!hijos.fin()) {
//						cola.encolar(hijos.proximo());
//					}
//				}	
//			}else {
//				if (!cola.esVacia()) {
//					cola.encolar(null);
//				}
//				caudal_act = caudal_act / cant_nodos;
//				
//				
//			}
//			
//			
//		}
//		
//	}

	
	//me queda una lista con un solo elemento donde está el minimo.
//	public double minimoCaudal(double caudal) {
//		ListaGenerica<Double> lista = new ListaEnlazadaGenerica<Double>();
//		ListaGenerica<Double> lista_min = new ListaEnlazadaGenerica<Double>();
//		lista.agregarInicio(caudal);
//		lista_min.agregarInicio(99999.0);
////		min  = 99999.0;
////		cau = caudal;
//		
//		calcularMinimo(this.red,lista,lista_min,caudal);
//		
//		//problema: guardo en una lista todo el camino cuando lo unico que me importa es el ultimo valor. 
//		return lista_min.elemento(lista_min.tamanio());
//	}
//
//	
//	public void clonar(ListaGenerica<Double> origen, ListaGenerica<Double> destino) {
//		origen.comenzar();
//		while (!origen.fin()) {
//			destino.agregarFinal(origen.proximo()); 
//		}
//	}
//	private void calcularMinimo(ArbolGeneral<T> red,ListaGenerica<Double> lista,ListaGenerica<Double> lista_min,Double caudal) {
//		lista.agregarFinal(caudal);
//		if (red.esHoja()) {
////			if (cau < min) {
////				min = cau;
////			}
//			if (lista_min.elemento(lista_min.tamanio()) > lista.elemento(lista.tamanio())){
//				clonar(lista,lista_min);
//			}
//		}else {
//			ListaGenerica<ArbolGeneral<T>> hijos = red.getHijos();
//			hijos.comenzar();
//			while (!hijos.fin()) {
//				//cau =cau/hijos.tamanio();
//				calcularMinimo(hijos.proximo(), lista,lista_min, caudal/hijos.tamanio());
//				lista.eliminarEn(lista.tamanio());
//			}
//		}
//		
//	
//	}
	public double minimoCaudal(double caudal) {
		if (red.esHoja()) {
			return caudal;
		}else {
			double min = caudal;
			double calc = 0;
			ListaGenerica<ArbolGeneral<T>> hijos = red.getHijos();
			hijos.comenzar();
			while (!hijos.fin()) {
				ArbolGeneral<T> hijo = hijos.proximo();
				RedDeAguaPotable<T> subRed = new RedDeAguaPotable<T>(hijo) ;
				calc = subRed.minimoCaudal(caudal /  hijos.tamanio());
				
				if (calc < min) {
					min = calc;
				}
			}
			return min;
			
		}

		
		
	}
	
}
