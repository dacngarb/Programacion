/*
 * Descripción: Ejercicio 8
 * Autor: David Cantero García
 * Eecha: 25/10/2025
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0, contador = 0, contadorNegativo= 0, contadorPositivo = 0;
		
		do {
			System.out.print("Dame un numero: ");
			num = teclado.nextInt();
			
			if (num < 0) {
            	contadorNegativo= contadorNegativo + 1;
            	
            }else if (num > 0) {
            	contadorPositivo = contadorPositivo + 1;
            }
			
		}while (num != 0);
		
		System.out.println("------------------------------");
		System.out.println(contadorNegativo + " números son negativos");
    	System.out.println(contadorPositivo + " números son positivos");
    	
		if (contadorNegativo > 0) {
			System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }
		
	}

}
