/*
 * Descripción: Ejercicio 10
 * Autor: David Cantero García
 * Eecha: 31/10/2025
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Solicitar el número de personas
        System.out.print("Dame el número de personas: ");
        int N = teclado.nextInt();

        double[] altura = new double[N];
        double suma = 0;

        //Bucle para pedir las alturas
        for (int contador = 0; contador < altura.length; contador++) {
            System.out.print("Dame la altura de la persona " + (contador + 1) + " : ");
            altura[contador] = teclado.nextDouble();
            suma = suma + altura[contador];
        }

        // Calculo la media
        double media = suma / N;

        // Calculo la altura máxima y la altura mínima
        double alturaMaxima = altura[0];
        double alturaMinima = altura[0];
        int encima = 0;
        int debajo = 0;

        //Vuelve a hacer el bule para ver si las alturas
        for (int tamanyo = 0; tamanyo < altura.length; tamanyo++) {
        	
        	//Dependiendo lo que se hace una operación u otra
            if (altura[tamanyo] > alturaMaxima) {
            	alturaMaxima = altura[tamanyo];
            	
            }if (altura[tamanyo] < alturaMinima) {
            	alturaMinima = altura[tamanyo];
            	
            }if (altura[tamanyo] > media) {
            	encima = encima + 1;
            	
            }if (altura[tamanyo] < media) 
            	debajo = debajo + 1;
        }

        // Mostrar resultados
        System.out.println("La altura media es: " + media);
        System.out.println("La altura máxima es: " + alturaMaxima);
        System.out.println("La altura máxima es: " + alturaMinima);
        System.out.println("Personas por encima de la media: " + encima);
        System.out.println("Personas por debajo de la media: " + debajo);
	}

}
