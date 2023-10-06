package exercicios_iniciante;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		double x, y, soma;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		x = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		y = sc.nextDouble();

		soma = x + y;
		
		System.out.println("Os valores digitados é: "+ x + " e " + y);
		System.out.println();
		System.out.println("A soma desses dois valore é: "+ soma);
		
		
		sc.close();

	}

}
