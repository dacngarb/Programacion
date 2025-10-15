/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 06/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame tu edad: "); 
		int edad;
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			
			teclado.nextLine();
			System.out.print("Dame tu nombre: "); 
			String nombre;
			nombre = teclado.nextLine();
			
			System.out.print("Dame tu apellido: "); 
			String apellido;
			apellido = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellido: " + apellido);
			System.out.println("Edad: " +edad);
			
			System.out.println("Usted ha sido admitido");
		}else {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		}
			
		
		
		
	}

}
