/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 10/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2;
		
		System.out.print("Dame una cadena: ");
		cadena1 = teclado.nextLine();
		
		System.out.print("Dame una cadena: ");
		cadena2 = teclado.nextLine();
		
		//Distiquir entre mayúsculas y minúsculas
		if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }

		System.out.println("-------------------------");
		
        //Diferenciar si son iguales sin contar las mayúsculas y minúsculas
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }
		
	}
}
