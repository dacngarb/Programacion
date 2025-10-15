/*
 * Descripción: pedir dia semana
 * Autor: David Cantero García
 * Eecha: 02/10/2025
 */

package estrcturaIF;

import java.util.Scanner;

public class EjemploIfCadena {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime la fecha: ");
		String fecha = teclado.nextLine();
		//fecha = fecha.toLowerCase() para que si hay datos mayusculas se pone en minusculas
		
		if (fecha.equals("jueves") || fecha.equals("JUEVES") ) { //hay que poner .equals para cadena de caracteres
			System.out.print("Felicidades sabes que dia es hoy");
		
		}

	}

}
