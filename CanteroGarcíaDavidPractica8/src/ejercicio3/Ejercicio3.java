/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 15/10/2025
 */

package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int contador;
		contador = 100;
		System.out.println("Números del 100 al 1");
		
		//se muestra en pantalla los numeros del 100 al 1
		do {
			System.out.print(" " + contador);
			contador = contador - 1;
			
		}while (contador >= 1);

	}

}
