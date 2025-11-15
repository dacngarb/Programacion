/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 12/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		//Pedir la frase 
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();

        //Pasar todo a minúsculas para no diferenciar
        frase = frase.toLowerCase();

        //Contadores de cada vocal
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        //Recorre la frase carácter por carácter
        for (int caracter = 0; caracter < frase.length(); caracter++) {
        	char c = frase.charAt(caracter);

            if (c == 'a') {
                a = a + 1;
            } else if (c == 'e') {
                e= e + 1;
            } else if (c == 'i') {
                i = i + 1;
            } else if (c == 'o') {
                o = o + 1;
            } else if (c == 'u') {
                u = u + 1;
            }
        }

        //Muestro el resultado
        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);
	}

}
