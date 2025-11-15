/*
 * Descripción: Ejercicio 5
 * Autor: David Cantero García
 * Eecha: 12/11/2025
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Pedir número de personas
        System.out.print("Introduce el número de personas: ");
        int numPersonas = teclado.nextInt();

        //Matriz para almacenar género y sueldo
        double[][] datos = new double[numPersonas][2];

        double sumaHombres = 0;
        double sumaMujeres = 0;
        int contadorHombres = 0;
        int contadorMujeres = 0;
        int genero;
        double sueldo;
        
        //bucle para pedir datos de cada persona
        for (int persona = 0; persona < numPersonas; persona++) {
            System.out.println("Persona " + (persona + 1));

            System.out.print("Género (0 para varón, 1 para mujer): ");
            genero = teclado.nextInt();

            System.out.print("Sueldo: ");
            sueldo = teclado.nextDouble();

            //Guardar en la matriz
            datos[persona][0] = genero;
            datos[persona][1] = sueldo;

            //Acumular según género
            if (genero == 0) {
            	sumaHombres = sumaHombres + sueldo;
                contadorHombres = contadorHombres + 1;
            } else if (genero == 1) {
                sumaMujeres = sumaMujeres + sueldo;
                contadorMujeres = contadorMujeres + 1;
            } else {
                System.out.println("Género inválido");
            }
        }

        //Calcular medias
        double mediaHombres;
        if (contadorHombres > 0) {
            mediaHombres = sumaHombres / contadorHombres;
        } else {
            mediaHombres = 0;
        }

        double mediaMujeres;
        if (contadorMujeres > 0) {
            mediaMujeres = sumaMujeres / contadorMujeres;
        } else {
            mediaMujeres = 0;
        }

        //Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Sueldo medio de hombres: " + mediaHombres);
        System.out.println("Sueldo medio de mujeres: " + mediaMujeres);

        //Detectar brecha salarial
        if (mediaHombres > mediaMujeres) {
            System.out.println("Existe brecha salarial: Los hombres cobran más de media");
        } else if (mediaMujeres > mediaHombres) {
            System.out.println("Existe brecha salarial: Las mujeres cobran más de media");
        } else {
            System.out.println("No existe brecha salarial: Ambos géneros cobran lo mismo de media");
        }
		
	}

}
