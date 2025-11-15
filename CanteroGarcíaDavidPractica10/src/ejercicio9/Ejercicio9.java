/*
 * Descripción: Ejercicio 9
 * Autor: David Cantero García
 * Eecha: 31/10/2025
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TAMANYO = 100;
		
		int [] num; //Declaro array de enteros
		num = new int [TAMANYO]; //Instanciar el array

		int N;
		int contador = 0;
		
		System.out.print("Dame un número del 1 al 10: ");
		N = teclado.nextInt();
		
		//Bucle para ir dando un numero aleatorio 
		for (int aleatorio = 0; aleatorio < num.length; aleatorio++) {
			num[aleatorio] = (int)(1+ Math.random() * 10);
		}
		
		//ver en que posicion del array se encuentra N
		System.out.println("El valor de la posicion " + N + " está en la posición:");
        for (int posicion = 0; posicion < num.length; posicion++) {
            if (num[posicion] == N) {
                System.out.print(posicion + " ");
                contador = contador + 1;
            }
        }
        
	}

}
