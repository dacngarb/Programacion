/*
 * Descripción: enumerar datos
 * Autor: David Cantero
 * Echa: 26/09/2025
 */

package tiposVariables;

public class TiposEnumerados {

	public enum Estación {VERANO, OTOÑO, INVIERNO, PRIMAVERA};
	
	public static void main(String[] args) {
		Estación estacionActual;
		estacionActual = Estación.OTOÑO;
		Estación estacionSiguiente; 
        estacionSiguiente = Estación.INVIERNO;
        
        System.out.println("Estaciión actual es: " + Estación.OTOÑO);
        System.out.println("Estación siguiente es " + Estación.INVIERNO);  

	}

}
