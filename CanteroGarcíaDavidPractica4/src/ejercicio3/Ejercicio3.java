/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 03/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Solicito los valores al usuario
		System.out.print("Dame el primer número: ");
		int num1 = teclado.nextInt();

		System.out.print("Dame el segundo número: ");
		int num2 = teclado.nextInt();

		// Intercambio los valores
		int cambio = num1;
		num1 = num2;
		num2 = cambio;

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}
}

