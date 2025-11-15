/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 20/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int contador = 1;
		
		//Montar los numeros pares 
		int num;
		System.out.print("Dame un número: ");
		num = teclado.nextInt();
		
		while (contador <= num) {
			System.out.print(" " + contador);
			contador = contador + 1;
		}

	}

}
