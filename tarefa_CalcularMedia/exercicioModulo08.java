package tarefa_CalcularMedia;

import java.util.Scanner;

public class exercicioModulo08 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota1;
		int nota2;
		int nota3;
		int nota4;
		double media;
		
		System.out.println("digite sua primeira nota -->");
		nota1 = teclado.nextInt();
		
		System.out.println("digite sua primeira nota -->");
		nota2 = teclado.nextInt();
		
		System.out.println("digite sua primeira nota -->");
		nota3 = teclado.nextInt();
		
		System.out.println("digite sua primeira nota -->");
		nota4 = teclado.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println(" Sua Média é --> "  + media);

	}

}
