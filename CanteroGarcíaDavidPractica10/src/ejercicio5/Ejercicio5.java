/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 24/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final int TAMANYO = 20;
		double [] num = new double [TAMANYO];
		double suma = 0, media = 0;
		
		//inicializo
		for (int contador = 0; contador != num.length; contador++) {
			System.out.print("Dame un número " + contador + ": "); 
			num [contador] = teclado.nextInt();
			
		}
		//creo otro bucle para que recorra el array para ir calculando los valores 
		for (int numero = 0; numero < num.length; numero++) {
			suma = suma + num[numero]; 
		}
		
		//una vez obtenida la suma se hace la media
		media = suma / TAMANYO;
		
		System.out.println("-----------------------------");
		//Muestro posicion
			for(int posicion = 0; posicion < num.length; posicion++) {

				System.out.println("El valor "  + posicion + " es: " + num[posicion]);
			}
			System.out.println("-----------------------------");
			
			System.out.println("La media de los valores es: " + media);
	}

}
