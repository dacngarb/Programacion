/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 10/11/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Leer la frase 
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        //quitar espacios y pasar a minúsculas
        String limpia = frase.replaceAll(" ", "").toLowerCase();

        //Invertir la cadena
        String invertida = new StringBuilder(limpia).reverse().toString();

        //Comparar original con invertida
        if (limpia.equals(invertida)) {
            System.out.println("La frase es un palíndromo");
        } else {
            System.out.println("La frase no es un palíndromo");
        }

	}

}
