package operadores;

public class ConversionTipo {

	public static void main(String[] args) {
		
		byte monederoPequenyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 1000000000l;
		
		monederoGrande = monederoMediano; //conversión automatica
		monederoMediano = monederoPequenyo;
		
		monederoPequenyo = (byte) monederoMediano; //cast
		System.out.println("Monedero pequeño: " + monederoPequenyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero Grande: " + monederoGrande);
	}

}
