/*
 * Descripción: Ejercicio 2
 * Autor: David Cantero García
 * Eecha: 05/11/2025
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//matriz de tamaño 10x10
		int [][] tabla = new int [10][10];
		
		//alamcenar en la matriz las tablas de multiplicar del 1 al 10
		for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla.length; columna++) {
            	tabla[fila][columna] = (fila + 1) * (columna + 1);
                
            }
        }
		
		//Mostrar las tablas con una fila para cada tabla
		for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla.length; columna++) {
            	
            	
            	System.out.print(tabla[fila][columna] + "\t");
            	
            }
            System.out.println();
		}
		
	}

}
