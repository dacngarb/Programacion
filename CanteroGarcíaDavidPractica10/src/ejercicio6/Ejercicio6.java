/*
 * Descripción: Ejercicio 6
 * Autor: David Cantero García
 * Eecha: 24/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int N, M;
		
		System.out.print("Dame un número: ");
		N = teclado.nextInt();
		
		System.out.print("Dame otro un número: ");
		M = teclado.nextInt();
		
		final int TAMANYO = N;
		int [] num = new int [TAMANYO];
		
		//inicializo
		for (int contador = 0; contador != num.length; contador++) {
			num [contador] = M;
		}
		 //Mostrar el valor dado en cada posicion dada
		for (int posicion = 0; posicion != num.length; posicion++) {
			System.out.println("El valor de la posición " + posicion + " es " + num[posicion]);
			}
		
		
	}

}
