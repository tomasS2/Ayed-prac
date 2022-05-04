package tp04.ejercicio1;

import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class AnalizadorArbol {
	
	public int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol) {
		int prom_max = 0;
		int prom_act = 0;
		int sum = 0;
		int cant_nodos = 0;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		ArbolGeneral<AreaEmpresa> arbol_aux;
		cola.encolar(arbol);
		cola.encolar(null);
		while (!cola.esVacia()) {
			arbol_aux = cola.desencolar();
			if (arbol_aux != null) {
				cant_nodos++;
				sum += arbol_aux.getDato().getTardanza();
				if (arbol_aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbol_aux.getHijos();
					hijos.comenzar();
					while (!hijos.fin()) {
						cola.encolar(hijos.proximo());
					}
				}
			}else {
				if (!cola.esVacia()) {
					cola.encolar(null);
				}
				prom_act = sum / cant_nodos;
				if (prom_act > prom_max) {
					prom_max = prom_act;
				}
				prom_act = 0;
				sum = 0;
				cant_nodos = 0;
			}
		}
		return prom_max;
	}
}
