/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 20/10/2025
 */

package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int contador = 1;
		
		//Mostrar los numeros pares del 1 al 200
		System.out.println("Números pares entre el 1 y 200");
		do {
			if (contador % 2 == 0) { 
				System.out.print(" " + contador);
			}
			contador = contador  + 1;
		} while (contador <= 200);

	}

}
