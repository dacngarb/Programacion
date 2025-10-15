/*
 * Descripción: pedir positivo negativo
 * Autor: David Cantero García
 * Eecha: 03/10/2025
 */

package estrcturaIF;

import java.util.Scanner;

public class EjemploIfCompuesta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int numero;
		numero = teclado.nextInt();
		
		if ( numero > 0) {			//el numero es positivo
			System.out.println("Positivo");
			if (numero > 50) {
				System.out.println("Es mayor de 50");
			}
		} else {					//no es positivo puede ser cero o negativo
			if (numero == 0) {
				System.out.println("Es cero");
			} else {
				System.out.println("negativo");
			}
		}
	}
}