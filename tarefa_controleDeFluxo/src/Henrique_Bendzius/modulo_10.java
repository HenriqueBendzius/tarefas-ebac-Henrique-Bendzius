package Henrique_Bendzius;

import java.util.Scanner;

public class modulo_10 {

	public static void main(String[] args) {

		try (Scanner teclado = new Scanner(System.in)) {
			double nota1;
			double nota2;
			double nota3;
			double nota4;
			double media;

			System.out.println("digite sua primeira nota -->");
			nota1 = teclado.nextInt();

			System.out.println("digite sua primeira nota -->");
			nota2 = teclado.nextInt();

			System.out.println("digite sua primeira nota -->");
			nota3 = teclado.nextInt();

			System.out.println("digite sua primeira nota -->");
			nota4 = teclado.nextInt();

			media = (nota1 + nota2 + nota3 + nota4) / 4;
			if (media >= 7) {
				System.out.println("Parabéns você foi Aprovado" + " --> " + media);
			} else if (media < 7 && media > 5) {
				System.out.println("Você ficou de Recuperação" + " --> " + media);
			} else {
				System.out.println("Você foi Reprovado " + " --> " + media);
			}
		}

	}

}
