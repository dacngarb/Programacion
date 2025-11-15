/*
 * Descripción: Ejercicio 8
 * Autor: David Cantero García
 * Eecha: 19/10/2025
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double distancia;
		int participantes;
		int edad;
		String ciudad;
		
		//Pidos los datos al usuario
		String nombre;
		System.out.print("Dame tu nombre: ");
		nombre = teclado.nextLine();
		
		String apellido;
		System.out.print("Dame tu apellido: ");
		apellido = teclado.nextLine();
		
		//se crea un bucle do while por si el usuario pone la edad correcta, no sigue hasta que no sea la correcta
		do {
            System.out.print("Dame tu edad: ");
            edad = teclado.nextInt();
            
            if (edad <= 17 || edad >= 45) {
                System.out.println("Esa edad no es correcta");
            }
        } while (edad <= 17 || edad >= 45);
		
		
		int rutasRealizadas;
		System.out.print("Número de rutas realizadas: ");
		rutasRealizadas = teclado.nextInt();
		
		double distanciaUltiRuta;
		System.out.print("Distancia de la última ruta: ");
		distanciaUltiRuta = teclado.nextDouble();

		double suma = 0, distanciaMax = 0;
        String ciudadMax = "";
        
        //se utiliza el bucle for ya que se sabe cuantas repeticiones se hara
		for (int contador = 0; contador < 5; contador++) { //se hara 5 repeticiones
			System.out.println("Caminata número " + (contador + 1)); //por cada caminata que pida suma uno
			
			//se pide los datos
			System.out.print("Distancia: ");
			distancia = teclado.nextDouble();
			suma = suma + distancia;
			
			System.out.print("Número de participantes: ");
			participantes = teclado.nextInt();
			
			teclado.nextLine();
			System.out.print("Ciudad: ");
			ciudad = teclado.nextLine();
			
			//Si la distancia es mayor que la que hay guardada en distanciaMax la sobreescribe
			 if (distancia > distanciaMax) {
				 	distanciaMax = distancia; 
	                ciudadMax = ciudad; //y se actualiza la ciudad con la ruta mas larga
	            }
			
        }
		double media = suma / 5; //media de la distancia
		
		//Ficha con todos los datos
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de rutas realizadas: " + rutasRealizadas);
        System.out.println("Distancia media (5 últimas rutas): " + media + " Km");
        System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMax + " Km");
        System.out.println("Ciudad de la ruta más larga: " + ciudadMax);

	}

}
