/*
 * Descripción: Ejercicio 4
 * Autor: David Cantero García
 * Eecha: 07/10/2025
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercico4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre;
		nombre = teclado.nextLine();
		
		System.out.print("Apellido: ");
		String apellido;
		apellido = teclado.nextLine();
		
		System.out.print("Importe Gastado1: ");
		int ImporteGastado1;
		ImporteGastado1 = teclado.nextInt();
		
		System.out.print("Importe Gastado2: ");
		int ImporteGastado2;
		ImporteGastado2 = teclado.nextInt();
		
		System.out.print("Importe Gastado3: ");
		int ImporteGastado3;
		ImporteGastado3 = teclado.nextInt();
		
		System.out.print("Importe Gastado4: ");
		int ImporteGastado4;
		ImporteGastado4 = teclado.nextInt();
		
		int suma;
		suma = ImporteGastado1 + ImporteGastado2 
			+ ImporteGastado3 + ImporteGastado4 ;
		
		int media;
		media = (ImporteGastado1 + ImporteGastado2 
			+ ImporteGastado3 + ImporteGastado4) / 4;
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Importe Gastado1: " + ImporteGastado1 + " euros");
		System.out.println("Importe Gastado2: " + ImporteGastado2 + " euros");
		System.out.println("Importe Gastado3: " + ImporteGastado3 + " euros");
		System.out.println("Importe Gastado4: " + ImporteGastado4 + " euros");
		System.out.println("Importe Medio: " + media + " euros");
		
		if (suma >= 300) {
			System.out.print("¡ENHORABUENA! tus compras han superado los 300 euros, "
					+ "por lo tanto tienes un vale de descuento de 50 euros");
		}else {
			System.out.print("Lo sentimos pero sus compras no han alcanzado "
					+ "los 300 euros este mes, no dispone de descuento");
		}
		
	}

}
