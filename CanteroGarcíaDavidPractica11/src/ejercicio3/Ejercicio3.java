/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 05/11/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un valor: ");
		int N = teclado.nextInt();
		
		System.out.print("Dame un valor: ");
		int M = teclado.nextInt();

		//matriz de tamaño NxM
		int [][] tamanyo = new int [N][M];
		
		
		int mayorCero = 0;
		int menorCero = 0;
		int igualCero = 0;
		
		// Rellenar la matriz
        System.out.println("Introduce los valores para rellenar la tabla:");
        for (int fila = 0; fila < tamanyo.length; fila++) {
            for (int columna = 0; columna < tamanyo[fila].length; columna++) {
                System.out.print("Elemento [" + fila + "][" + columna + "]: ");
                tamanyo[fila][columna] = teclado.nextInt();
                
                if (tamanyo[fila][columna] > 0) {
					mayorCero = mayorCero + 1;
				
				}else if (tamanyo[fila][columna] < 0) {
					menorCero = menorCero + 1;
				}else {
					igualCero = igualCero + 1;
				
				}
            }
        }
		
        System.out.println("------------------------------------");
        
		//Mostrar el array
		for (int fila = 0; fila < tamanyo.length; fila++) {
			for (int columna = 0; columna < tamanyo[fila].length; columna++) {	
				System.out.print(tamanyo[fila][columna] + "\t");
			}
			 System.out.println();
		}
		//Mostrar la cantidad mayor, menor e igual de 0
		System.out.println("Los valores por encima del 0 son: " + mayorCero);
		System.out.println("Los valores por debajo del 0 son: " + menorCero);
		System.out.println("Los valores son iguales a 0 son: " + igualCero);
		}
	
}
