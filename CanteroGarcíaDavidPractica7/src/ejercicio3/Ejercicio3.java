/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 09/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime tu nota academica: ");
		int nota;
		nota = teclado.nextInt();
		
		//se utiliza la funcion switch para hacer una seleccion de las notas y segun la nota se indica la calificacion correspondiente
		switch (nota) {
			case 1,2,3,4: {
				System.out.print("Insuficiente");
				break;
			}
			case 5: { 
				System.out.print("Suficiente");
				break;
			}
			case 6: {
				System.out.print("Bien");
				break;
			}
			case 7,8: {	
				System.out.print("Notable");
				break;
			}
			case 9,10: {	
				System.out.print("Sobresaliente");
				break;
			}
			default:{
				System.out.println("La nota no es valida"); //si la nota no es ninguna de las asociadas salta mensaje de nota no valida
			}
		}

	}

}
