/*
 * Descripción: pedir la edad y mostrar si es mayor de edad
 * Autor: David Cantero García
 * Eecha: 02/10/2025
 */


package estrcturaIF;

import java.util.Scanner;

public class EjemploIF {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		int edad = teclado.nextInt();
		
		if ( (edad >= 18) && (edad <= 30) ) { //si se añade en medio el operador logica && coge las dos ondiciones, pero si añade || segun lo que se ponga elege uno u otro
			System.out.println("Eres mayor de edad y joven");
			
			}
	
	}

}
