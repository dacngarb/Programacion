/*
 * Descripción: Ejercicio 7
 * Autor: David Cantero García
 * Eecha: 18/10/2025
 */

package ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random random = new Random(); //se crea el objeto random para genrar numeros aleatorios
		
		int num = random.nextInt(51);
		int intento;
		
		//el programa piensa un numero aleatorio
		System.out.println("Adivina un número entre el 0 y el 50");
		
		do {
            System.out.print("Introduce tu número: ");
            intento = teclado.nextInt();

            //si es menor salta  el mensaje que es mayor y viceversa y cuando se adivine te lo avisa
            if (intento < num) {
                System.out.println("El número es mayor.");
            } else if (intento > num) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("Has adivinado el número.");
            }
        } while (intento != num); //el programa para cuando se acierta el numero
	}

}
