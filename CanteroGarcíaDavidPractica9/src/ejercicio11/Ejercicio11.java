/*
 * Descripción: Ejercicio 11
 * Autor: David Cantero García
 * Eecha: 27/10/2025
 */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int suma = 0, pares, impares, sumaPares = 0, sumaImpares = 0;
		
		//crear el bucle y filtrando el rango
		for (int contador = 100; contador <= 200; contador++) {
            if (contador % 2 == 0) { //que si es par los sume
                sumaPares = sumaPares + contador;
            } else { //y si es impar tambien
                sumaImpares = sumaImpares + contador;
            }
        }

        System.out.println("La suma de todos los números pares entre 100 y 200 es: " + sumaPares);
        System.out.println("La suma de todos los números impares entre 100 y 200 es: " + sumaImpares);
		
		
	}

}
