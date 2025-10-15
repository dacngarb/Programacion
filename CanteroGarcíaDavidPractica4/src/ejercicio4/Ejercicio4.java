/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 04/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		double dato;
		dato = teclado.nextDouble();
		
		//Aplico las funciones de la clase Math
		double ceil = Math.ceil(dato);
		double floor = Math.floor(dato);
		double round = Math.round(dato); 
		
        System.out.println("Valor original: " + dato);
        System.out.println("Valor de la función ceil: " + ceil + "  Redondea hacia arriba al númweo entero más cercano");
        System.out.println("Valor de la función floor: " + floor + " Redondea hacia abajo al número entero más cercano");
        System.out.println("Valor de la función round: " + round + " Redondea al número entero más cercano");
	}

}
