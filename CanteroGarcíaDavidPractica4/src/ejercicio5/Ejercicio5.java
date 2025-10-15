/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 05/10/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		double num1;
		num1 = teclado.nextDouble();
		
		System.out.print("Dame otro número: ");
		double num2;
		num2 = teclado.nextDouble();
		
		// Averiguar cuál número es menor
		double valorMenor;
		valorMenor = Math.min(num1, num2);
		System.out.println("El número menor es: " + valorMenor);
		
		// Calcular el primer numero elevado al segundo
		double elevado;
		elevado = Math.pow(num1, num2);
		System.out.println("El resultado del primer número elevado al segundo es: " + elevado);
		
		// calcular la raiz cuadrada del primer numero
		double raizCuadrada;
		raizCuadrada = Math.sqrt(num1);
		System.out.println("La raiz cuadrada de " + num1 + " es: " + raizCuadrada);
		
		//Calcular un valor aleatorio del sugundo dato
		double valorAleatorio;
		valorAleatorio = Math.random() * num2;
		System.out.println("El resultado entre un numero aleatorio y " + num2 + " es: " + valorAleatorio);
	}
	

}
