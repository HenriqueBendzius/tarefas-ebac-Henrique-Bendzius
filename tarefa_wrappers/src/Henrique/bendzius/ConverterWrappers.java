package Henrique.bendzius;

public class ConverterWrappers {

	public static void main(String[] args) {
		//casting explicito
		int numero1 = 1000100010;
		System.out.println(numero1);
		short numero2 = (short) numero1;
		System.out.println(numero2);
		
		System.out.println("***********");
		
		
		long numeroLong = 123456789123456789l;
		System.out.println(numeroLong);
		int numeroInt = (int) numeroLong;
		System.out.println(numeroInt);
		
		
		System.out.println("***********");
		
		
		byte bi = (byte) 123456789;
		System.out.println(bi);
		short shor = bi;
		System.out.println(shor);
		
		
		System.out.println("***********");
		
		short shor1 =(short) 123456789;
		System.out.println(shor1);
		byte bi1 = (byte) shor1;
		System.out.println(bi1);
	}

}
