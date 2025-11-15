/*
 * Descripción: Ejercicio 7
 * Autor: David Cantero García
 * Eecha: 25/10/2025
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num = 0, contadorNegativo = 0, contadorPositivo = 0, contador = 0;  
        System.out.println("Introduce 100 números no nulos (los ceros no cuentan):");

        //crear un bucle para que pida 100 numeros
        while (contador < 100) {
            System.out.print("Número " + (contador + 1) + ": ");
            num = teclado.nextInt();

            //si el usuario da un 0 salta un mensaje y no cuenta
            if (num != 0) {
            	//filtrar que si es numero negativo o positivo y lo acumule
                if (num < 0) {
                	contadorNegativo= contadorNegativo + 1;
                	
                }else if (num > 0) {
                	contadorPositivo = contadorPositivo + 1;
                }

                contador = contador + 1;           
            }else {
            	System.out.println("El 0 no cuenta. Introduce otro número.");

            }
            
        }
        	System.out.println("------------------------------");
        	System.out.println(contadorNegativo + " números son negativos");
        	System.out.println(contadorPositivo + " números son positivos");

	}

}
