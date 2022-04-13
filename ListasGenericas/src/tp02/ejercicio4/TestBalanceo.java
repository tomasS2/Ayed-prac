//b) Implemente una clase llamada tp02.ejercicio4.TestBalanceo (pase por máquina), cuyo
//objetivo es determinar si un String dado está balanceado. El String a verificar es un parámetro
//de entrada (no es un dato predefinido).
package tp02.ejercicio4;
//4. Considere un string de caracteres S, el cual comprende únicamente los caracteres: (,),[,],{,}.

//Decimos que S está balanceado si tiene alguna de las siguientes formas:
//S = "" S es el string de longitud cero.
//S = "(T)"
//S = "[T]"
//S = "{T}"
//S = "TU"
//Donde ambos T y U son strings balanceados. Por ejemplo, "{( ) [ ( ) ] }" está balanceado, pero
//"( [ ) ]" no lo está.
//a) Indique que estructura de datos utilizará para resolver este problema y como la utilizará.
//b) Implemente una clase llamada tp02.ejercicio4.TestBalanceo (pase por máquina), cuyo
//objetivo es determinar si un String dado está balanceado. El String a verificar es un parámetro
//de entrada (no es un dato predefinido).

import tp02.ejercicio3.*;

public class TestBalanceo {
	public Boolean esBalanceado(String str) {

		Boolean cumple = true;
		PilaGenerica<Character> p = new PilaGenerica<Character>();
		int i = 0;
		while ((i < str.length()) && (cumple)) {
			if ((str.charAt(i) == '(') || (str.charAt(i) == '[') || (str.charAt(i) == '{')) {
				p.apilar(str.charAt(i));
			} else {
				if (str.charAt(i) == ')') {
					if (!p.desApilar().equals('(')) {

						cumple = false;
					}

				} else {
					if (str.charAt(i) == ']') {
						if (!p.desApilar().equals('[')) {
							cumple = false;
						}

					} else {

						if (str.charAt(i) == '}') {
							if (!p.desApilar().equals('{')) {
								cumple = false;
							}
						} else {
							cumple = false;
						}
					}
				}

			}
			i++;
		}
		return cumple;

	}


}

//switch (str.charAt(i)) {
//case ')':		
//	System.out.println(str.charAt(i));
//	if (!p.desApilar().equals('(')) {
//		noCumple = true;
//	}
//case ']':
//	System.out.println(str.charAt(i));
//	if (!p.desApilar().equals('[')) {
//		noCumple = true;
//	}
//case '}':
//	System.out.println(str.charAt(i));
//	if (!p.desApilar().equals('{')) {
//		noCumple = true;
//	}
//default:
//	noCumple = true;
//}
