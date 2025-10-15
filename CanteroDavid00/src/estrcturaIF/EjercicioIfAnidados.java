/*
 * Descripción: Ejercicio IF Anidados
 * Autor: David Cantero García
 * Eecha: 06/10/2025
 */

package estrcturaIF;

import java.util.Scanner;

public class EjercicioIfAnidados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Preguntas acertadas: ");
		int acertadas;
		acertadas = teclado.nextInt();
		
		System.out.print("Preguntas erroneas: ");
		int erroneas;
		erroneas = teclado.nextInt();
		
	
		
		double bien;
		bien = acertadas * 0.5;
		
		double resto;
		resto = erroneas - 0.25;
		
		double total;
		total = bien - resto;
		
		if ((total >= 0 && total <= 10)) {
			if (total >=5) {
				System.out.println("Has aprobado");
			}else {
				System.out.println("Has suspendido");
			} 
		}
		
		if (acertadas + erroneas > 20) { //si la suma de acertadas y erroneas pasa 20 saldra error
			System.out.println("Datos erróneos");
		} else {
			System.out.println("Tu nota es " + total);
		}
		
		
	}
		
}
