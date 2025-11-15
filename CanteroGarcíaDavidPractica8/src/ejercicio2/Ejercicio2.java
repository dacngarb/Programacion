/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 15/10/2025
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int contador;
		contador = 1;
		System.out.println("Números del 1 al 100");
		
		//se muestra en pantalla los numeros del 1 al 100
		do {
			System.out.print(" " + contador);
			contador = contador + 1;
			
		}while (contador <= 100);
		
	}

}
