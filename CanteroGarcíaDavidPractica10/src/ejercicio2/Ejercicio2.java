/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 23/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//creo el array para almacenar
		final int TAMANYO = 10;
		double [] num = new double [TAMANYO];
		double suma = 0;
		
		//inicializo
		for (int contador = 0; contador != num.length; contador++) {
			System.out.print("Dame un número " + contador + ": "); 
			num [contador] = teclado.nextDouble();
			suma = suma + num[contador]; //sumo todos los valores
		}
		System.out.println("-----------------------------");
		//Muestro posicion
			for(int posicion = 0; posicion < num.length; posicion++) {
				
				
				System.out.println("El valor "  + posicion + " es: " + num[posicion]);
				
			}
			System.out.println("La suma de las valores es: " + suma);

	}

}
