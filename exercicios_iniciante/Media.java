package exercicios_iniciante;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double a, b, c, media;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o primeiro valor: ");
		a = sc.nextDouble();
		System.out.println("Informe o segundo o valor: ");
		b = sc.nextDouble();
		System.out.println("Informe o terceiro valor: ");
		c = sc.nextDouble();
		
		media = (a + b + c) / 3;
		
		System.out.println("O valor da média é: "+ media);
		
		sc.close();

	}

}
