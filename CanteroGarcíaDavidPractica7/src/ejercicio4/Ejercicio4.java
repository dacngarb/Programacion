/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 10/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Se pide al usuario cuatro notas academicas
		System.out.print("Dame tu nota de base de datos: ");
		double notaBD;
		notaBD = teclado.nextDouble();
		
		System.out.print("Dame tu nota de programación: ");
		double notaProgramacion;
		notaProgramacion = teclado.nextDouble();
		
		System.out.print("Dame tu nota de Sistemas informaticos: ");
		double notaSistemas;
		notaSistemas = teclado.nextDouble();
		
		System.out.print("Dame tu nota de Digitalización: ");
		double notaDigitalización;
		notaDigitalización = teclado.nextDouble();
		
		//una vez obtenidas se suma todas las notas y se divide entre las cuatro para hacer la media
		double notaMedia;
		notaMedia = (notaBD + notaProgramacion + notaSistemas + notaDigitalización) / 4;
		System.out.println("Nota media es: " + notaMedia);
		
		//se utulliza funcione math para hacer redondeo arriba y abajo
		double ceil;
		ceil = Math.ceil(notaMedia);
		double floor;
		floor = Math.floor(notaMedia);
		
		System.out.println("Nota media redondeada hacia arriba es: " + ceil);
		System.out.println("Nota media redondeada hacia abajo es: " + floor);
		
		//Y segun la nota media obtenida se notifica al usuario si es suficiente o no
		if (notaMedia > 8) {
			System.out.print("Puede acceder a estudios superiores");
		}else {
			System.out.print("La nota media obtenida no es suficiente para acceder a los estudios que desea");
		}
		
	}

}
