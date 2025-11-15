/*
 * Descripción: Ejercicio 12
 * Autor: David Cantero García
 * Eecha: 27/10/2025
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double A, B, potencia;
		
		System.out.print("Dame un número: ");
		A = teclado.nextInt();
		
		System.out.print("Dame un número para que sea la potencia: ");
		B = teclado.nextInt();
		
		potencia = Math.pow(A, B);
		
		System.out.println("--------------------------------------------------");
		System.out.print("El resultado de calcular " + A + " elevado a " + B + " es: " + potencia);
	}

}
