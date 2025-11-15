/*
 * Descripción: Ejercicio 11
 * Autor: David Cantero García
 * Eecha: 31/10/2025
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//Declaro e instancio los dos array de enteros
		int[] arrayPrimero = new int[100];
        int[] arraySegundo = new int[100];
		
        
        //ocupar los valores en el array original
		for (int original = 0; original < arrayPrimero.length; original++) {
			arrayPrimero[original] = original + 1;
		}
		// Copiar los valores al segundo array en orden inverso
		for (int inverso = 0; inverso < arrayPrimero.length; inverso++) {
			arraySegundo[inverso] = arrayPrimero[arrayPrimero.length - 1 - inverso];
        }
		
		//Mostrar el primer array
		System.out.println("Array original: ");
        for (int posicion = 0; posicion < arrayPrimero.length; posicion++) {
        	System.out.print(arrayPrimero[posicion] + " ");
        }
        
        //mostrar el array invertido
        System.out.println("\nArray invertido: ");
        for (int posicion = 0; posicion < arraySegundo.length; posicion++) {
        	System.out.print(arraySegundo[posicion] + " ");
        }
		
	}

}
