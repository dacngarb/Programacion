/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 15/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int  numero, contador = 0, suma = 0; 
		double media = 0;
		
			System.out.println("Dame un número (0 para terminar): ");
			numero = teclado.nextInt();
			contador = 1;
			suma = numero;
			
			//si es mayor que 0 se realida el bucle sumando los numeros y la cantidad q da
			if (numero > 0) {
				while (numero != 0) {
					System.out.println("Dame un número (0 para terminar): ");
					numero = teclado.nextInt();
					contador = contador + 1;
					suma = suma + numero;
				}
				
				contador = contador - 1; //resto 1 a ccontador para no contar el 0
				media = (suma + numero) / contador; //Hacer la media sumando los valores que da el usuario y el resultado dividirlo entre la cantidad de numeros dados
				System.out.println("La suma es: " + suma + " y la cantidad de número es: " + contador + " y la media es " + media);
			}else {
				System.out.println("Número no válido");
			}
		
	}

}
