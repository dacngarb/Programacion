/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 30/09/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Se añade Scanner para que pida al usuario datos 
			
		String nombreEquipo;
		System.out.print("Nombre del Equipo: ");
		nombreEquipo = teclado.nextLine();
		
		int fechaFundado;
		System.out.print("Fundado en: ");
		fechaFundado = teclado.nextInt();
		
		teclado.nextLine();
		
		String estadioEquipo;
		System.out.print("Estadio: ");
		estadioEquipo = teclado.nextLine();
		
		String capitanEquipo;
		System.out.print("Capitán: ");
		capitanEquipo = teclado.nextLine();
		
		System.out.println("Nombre del Equipo: " + nombreEquipo);
		System.out.println("Fundado en: " + fechaFundado);
		System.out.println("Estadio: " + estadioEquipo);
		System.out.println("Capitán: " + capitanEquipo);
	}

}
