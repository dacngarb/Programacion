/*
 * Descripción: Ejercicio 9
 * Autor: David Cantero García
 * Eecha: 25/10/2025
 */

package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		 int suma = 0;
	     int producto = 1;
	     
	     //utilizar el bucle for para repetir el procesos
	     for (int contador = 1; contador <= 10; contador++) {
	    	 suma = suma + contador; //sumar y volver a sumar hasta sumar los 10 primeros números
	         producto = producto * contador; //multiplicar y volver multiplicar hasta multiplicar los 10 primeros números
	           
	     }

	     System.out.println("La suma de los 10 primeros números naturales es: " + suma);
	     System.out.println("El producto de los 10 primeros números naturales es: " + producto);

	}

}
