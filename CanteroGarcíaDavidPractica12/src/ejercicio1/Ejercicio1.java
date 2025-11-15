/*
 * Descripción: Ejercicio 1
 * Autor: David Cantero García
 * Eecha: 10/11/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		//Solicito la cadena
		System.out.print("Dame una cadena de caracteres: ");
		String cadena = teclado.nextLine();
		
		//con split divido la cadena en palabras 
		String[] separacion = cadena.split(" "); 
		
		//Mostrar cada palabra en una línea distinta
		for (int dividir = 0; dividir < separacion.length; dividir++) {
		    System.out.println(separacion[dividir]);
		}
	}
}
