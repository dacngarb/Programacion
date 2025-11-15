/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 20/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Calcular el valor factorial de un numero que de el usuario
		int num;
		System.out.println("Dame un número positivo: ");
		 num = teclado.nextInt();
		 
		 for (int contador = 0; contador < num; contador++) {
			 System.out.println("Valor factorial es: " + (contador * num));
		 }
		 
	}

}
