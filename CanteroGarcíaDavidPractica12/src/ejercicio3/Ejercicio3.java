/*
 * Descripción: Ejercicio 3
 * Autor: David Cantero García
 * Eecha: 10/10/2025
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pido los datos
        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = teclado.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = teclado.nextLine();

        //Tomo las tres primeras letras de cada uno y concatenar
        String codigo = (nombre.substring(0, 3) + apellido1.substring(0, 3) + apellido2.substring(0, 3)).toUpperCase();

        //Muestro el resultado
        System.out.println("Tu código de usuario es: " + codigo);
		
	}

}
