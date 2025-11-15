/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 23/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//creo el array para almacenar
		final int TAMANYO = 10;
		double [] num = new double [TAMANYO];
		
		
		//inicializo
		for (int contador = 0; contador != num.length; contador++) {
			System.out.print("Dame un número " + contador + ": "); 
			num [contador] = teclado.nextDouble();
			
		}
		double numMax = num[0], numMin = num[0]; 
		
		//creo otro bucle para que recorra el array para averiguar el numero maximo  y minimo
		for (int numero = 1; numero < num.length; numero++) {
            if (num[numero] > numMax) {
            	numMax = num[numero];
            }
            if (num[numero] < numMin) {
            	numMin = num[numero];
            }
        }
		
		System.out.println("-----------------------------");
		//Muestro posicion
			for(int posicion = 0; posicion < num.length; posicion++) {

				System.out.println("El valor "  + posicion + " es: " + num[posicion]);
			}
			System.out.println("-----------------------------");
			
			System.out.println("El valor máximo es: " + numMax);
			System.out.println("El valor mínimo es: " + numMin);

	}

}
