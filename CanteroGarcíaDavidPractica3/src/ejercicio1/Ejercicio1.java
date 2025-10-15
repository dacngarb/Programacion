/*
 * Descripción: Ejercicio 1
 * Autor: David Cantero García
 * Eecha: 26/09/2025
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); //Se añade Scanner para que pida al usuario datos 
		 
		String nombreAlumno;
		System.out.print("Dame tu nombre:");
		nombreAlumno = teclado.nextLine(); //nextLine para datos String
		System.out.println("El nombre es: " + nombreAlumno);
		
		String apellidoAlumno;
		System.out.print("Dame tu apellido:");
		apellidoAlumno = teclado.nextLine(); //nextLine para datos String
		System.out.println("El apellido es: " + apellidoAlumno);
		
		int edadAlumno;
		System.out.print("Dame tu edad: ");
		edadAlumno = teclado.nextInt();	//nextInte para datos int
		System.out.println("La edad es: " + edadAlumno);
		
		teclado.nextLine();	//Se añade despues de pedir datos y antes de pedir cadena de caracteres
		String direccionAlumno;
		System.out.print("Dame tu dirección: ");
		direccionAlumno = teclado.nextLine();	//nextLine para datos String
		System.out.println("La dirección es: " + direccionAlumno);
		
		double alturaAlumno;
		System.out.print("¿Cuánto mides?: ");
		alturaAlumno = teclado.nextDouble();	//nextDouble para datos double
		System.out.println("La altura es: " + alturaAlumno + " m");
		
		double pesoAlumno;
		System.out.print("¿Cuánto pesa?: ");
		pesoAlumno = teclado.nextDouble();	//nextDouble para datos double
		System.out.println("El peso es: " + pesoAlumno + " Kg");
	}

}
