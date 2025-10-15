/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 02/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		double cambio = 166.386; //le doy un valor a "cambio" que será lo que vale pesetas
		
        // convertir euros a pesetas
		
        System.out.print("Introduce la cantidad en euros: ");
        double euros;
        euros = teclado.nextDouble();
        
        double pesetas;
        pesetas = euros*cambio;
        System.out.println(euros + "€ son " + pesetas +  " pesetas");

        // Convertir pesetas a euros
        
        System.out.print("Introduce la cantidad en pesetas: ");
        pesetas = teclado.nextDouble();
        euros = pesetas/cambio;
        System.out.println(pesetas + " pesetas son " + euros + "€");
	}

}
