/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 23/10/2025
 */


package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//creo el array para almacenar
		final int TAMANYO = 20;
		int [] num = new int [TAMANYO];
		int numPositivo = num[0], numNegativo = num[0];
		
		//inicializo
		for (int contador = 0; contador != num.length; contador++) {
			System.out.print("Dame un número " + contador + ": "); 
			num [contador] = teclado.nextInt();
		
			//Digo que dependiendo si es positivo o negativo lo guarde el su correspondiente y lo sume
			if (num[contador] > 0) {
				numPositivo = num[contador] + numPositivo;
			} if (num[contador] < 0) {
				numNegativo = num[contador] + numNegativo;
			}
		}
		
		
		System.out.println("-----------------------------");
		//Muestro posicion
			for(int posicion = 0; posicion < num.length; posicion++) {

				System.out.println("El valor "  + posicion + " es: " + num[posicion]);
			}
			System.out.println("-----------------------------");
			
			System.out.println("La suma de los valores positivos es: " + numPositivo);
			System.out.println("La suma de los valores negativos es: " + numNegativo);


	}

}
