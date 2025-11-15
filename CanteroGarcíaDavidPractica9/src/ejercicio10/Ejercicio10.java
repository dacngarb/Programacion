/*
 * Descripción: Ejercicio 10
 * Autor: David Cantero García
// * Eecha: 27/10/2025
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, contador = 0;
		
		
		do {
			System.out.print("Dame un número (-1 para terminar): ");
			num = teclado.nextInt();
			
			//filtrar el rango 
			if (num < 0 || num > 10) {
                System.out.println("Nota no válida. Introduce un valor entre 0 y 10");
			}
			
			//y que si hay un 10 lo acumule
            if (num == 10) {
            	contador = contador + 1; //filtrar que si es 10 lo acumele
            }
			
		}while (num != -1);
		
		
		if (contador > 10) {
            System.out.println("Ha habido al menos una nota con valor 10");
        } else {
            System.out.println("No hubo ninguna nota con valor 10");
        }
		
	}
}
