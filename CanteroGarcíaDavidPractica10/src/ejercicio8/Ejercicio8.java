/*
 * Descripción: Ejercicio 8
 * Autor: David Cantero García
 * Eecha: 30/10/2025
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int contador = 0;
		double [] num;
		num = new double [100];
		
		//Bucle para que piense en un numero aleatorio
		
		
		 double R;
		 System.out.print("Dame un número real entre 0 y 100: ");
		 R = teclado.nextDouble();
		 
		//Contar cuántos valores son iguales o superiores a R
		 for (int posicion = 0; posicion < num.length; posicion++) {
			    double numero = num[posicion];
			    if (numero <= R) {
			    	contador = contador + 1;
			 
			    }
		 }
		 
		 System.out.println("Son " + contador + " valores reales superiores");
	}

}
