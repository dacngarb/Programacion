/*
 * Descripción: Ejercicio 1
 * Autor: David Cantero García
 * Eecha: 06/10/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		double num1;
		num1 = teclado.nextDouble();
		
		System.out.print("Dame otro número: ");
		double num2;
		num2 = teclado.nextDouble();
		
		//utilizo la estructura de selecció ifpara condiciar ambas opciones
		if  (num1 > num2) { //se aclara si es mayor 
			System.out.println("El primer dato es mayor");
		} else {
			if (num1 < num2) { //se aclara si es menor 
				System.out.println("El primer dato es menor");
		} else { //se aclara que si no es ni mayor ni menor es igual
			System.out.println("Los datos son iguales");
		}
		}
	}

}
