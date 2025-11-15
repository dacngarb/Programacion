/*
 * Descripción: Ejercicio 6
 * Autor: David Cantero García
 * Eecha: 20/10/2025
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0, contadorNegativo = 0, contador = 0;  
	        System.out.println("Introduce 100 números no nulos (los ceros no cuentan):");

	        //crear un bucle para que pida 100 numeros
	        while (contador < 100) {
	            System.out.print("Número " + (contador + 1) + ": ");
	            num = teclado.nextInt();

	            //si el usuario da un 0 salta un mensaje y no cuenta
	            if (num != 0) {
	            	if (num < 0) {
	                	contadorNegativo = contadorNegativo + 1; //filtrar que si es numero negativo lo acumule
	                }
		            
		            contador = contador + 1;
	             
	            } else {
	                System.out.println("El 0 no cuenta. Introduce otro número");
	            } 
	            
	        } 
	            
	        //ver si ha leido negativos o no y decirlo
	        if (contadorNegativo > 0) {
	            System.out.println("Se ha leído al menos un número negativo");
	        } else {
	            System.out.println("No se ha leído ningún número negativo");
	        }
	    
	}

}
