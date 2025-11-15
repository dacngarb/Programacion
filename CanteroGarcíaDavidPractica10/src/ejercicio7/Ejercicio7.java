/*
 * Descripción: Ejercicio 7
 * Autor: David Cantero García
 * Eecha: 24/10/2025
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int P, Q;
		
		System.out.print("Dame un número: ");
		P = teclado.nextInt();
		
		System.out.print("Dame otro un número: ");
		Q = teclado.nextInt();
		
		int [] num = new int [Q - P + 1];
		for (int contador = 0; contador < num.length; contador++) {
            num[contador] = P + contador;
        }
		
		for (int posicion = 0; posicion != num.length; posicion++) {
			System.out.println("El valor de la posición " + posicion + " es " + num[posicion]);
			}
      
    
	}

}
