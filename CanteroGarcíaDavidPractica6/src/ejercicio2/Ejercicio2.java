/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 06/10/2025
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre;
		nombre = teclado.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad;
		edad = teclado.nextInt();
		
		System.out.println("Introduce tu nota academica: ");
		int nota;
		nota = teclado.nextInt();
		
		if ( (nota >= 0 && nota <= 20) ) { //Pongo un rango de nota que admitira
			if (edad >= 18 && nota >= 7) {		//Pongo la regla que debe cumplir de edad y nota
				System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas"); //si todo es correcto saldra este mensaje
			} else { 
				System.out.println(nombre + ", sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos"); //y si no lo cumple sale esto
			}
			
			} else { System.out.println("Nota erronea"); //si la nota pasa del rango salta esto
			
		}
	}

}
