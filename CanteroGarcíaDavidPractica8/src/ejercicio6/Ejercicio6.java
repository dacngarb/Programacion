/*
 * Descripción: Ejercicio 6
 * Autor: David Cantero García
 * Eecha: 17/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num; 
		double potencia = 0;
		
			//decir el cuandrado de un numero que de el usuario
			do {
				System.out.println("Dame un número: ");
				num = teclado.nextInt();
				potencia = Math.pow(num, 2);
				System.out.println("El cuadrado de " + num + " es: " + potencia);

			}while (num >= 0);

	}

}
