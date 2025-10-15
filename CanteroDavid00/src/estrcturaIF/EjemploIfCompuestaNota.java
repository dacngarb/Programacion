/*
 * Descripción: pedir nota
 * Autor: David Cantero García
 * Eecha: 03/10/2025
 */

package estrcturaIF;

import java.util.Scanner;

public class EjemploIfCompuestaNota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int numero;
		numero = teclado.nextInt();
		
		if ( (numero >= 0 && numero <= 10) ) {
			
		
			if (numero >= 5) {
				System.out.println("Aprobado");
			} else {
				System.out.println("Suspenso");
			}
		
		} else {
			System.out.println("Nota erronea");
		}
	}

}