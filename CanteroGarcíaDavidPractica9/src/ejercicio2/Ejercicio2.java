/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 20/10/2025
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int contador = 2;
		
		//monstrar los numeros pares entre el 1 y el 200
		System.out.println("Números pares entre el 1 y 200");
		do {
			System.out.print(" " + contador);
			contador = contador + 2;
			
		} while(contador <= 200); 
			
	}

}
