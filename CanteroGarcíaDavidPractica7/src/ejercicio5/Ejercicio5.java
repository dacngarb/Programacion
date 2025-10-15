/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 13/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer valor: ");
		double num1;
		num1 = teclado.nextDouble();
		
		System.out.print("Introduce el segundo valor: ");
		double num2;
		num2 = teclado.nextDouble();
		
		//pido al usuario que operacion quiere hacer
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		System.out.print("Indica la operación que quieras realizar (Inserta un número): ");
		int operacion;
		operacion = teclado.nextInt();
		
		
		//segun el numero que marque se hara una operacion un otra
		if (operacion == 1) {
			double suma;
			suma = num1 + num2;
			System.out.print("Resultado: " + suma);
		}else if (operacion == 2) {
			double resta;
			resta = num1 - num2;
			System.out.print("Resultado: " + resta);
		}else if (operacion == 3) {
			double multiplicacion;
			multiplicacion = num1 * num2;
			System.out.print("Resultado: " + multiplicacion);
		}else if (operacion == 4){
			double division;
			division = num1 / num2;
			System.out.print("Resultado: " + division);
		}
	}

}
