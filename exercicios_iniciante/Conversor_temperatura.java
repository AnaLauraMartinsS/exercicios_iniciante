package exercicios_iniciante;

import java.util.Locale;
import java.util.Scanner;


public class Conversor_temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double f, c, calculo1, calculo2;
		int op;
		
		System.out.println("---- Escolha a sua opção ----");
		System.out.println("[1] Celcius -> Fahrenheit ");
		System.out.println("[2] Fahrenheit -> Celcius ");
		System.out.println("Qual conversão você deseja?: ");
		op = sc.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("Você escolheu conversão de Celcius para Fahrenhit.");
				System.out.println("Digite a temperatura em Cº:");
				c = sc.nextInt();
				calculo1 = (c * 1.8) +32;
				System.out.printf( c + " Cº em Fahrenhit é: %.2f%n", calculo1);
			break;
			case 2:
				System.out.println("Você escolheu de Fahrenhit para Celcius.");
				System.out.println("Digite a temperatura em Fº:");
				f = sc.nextDouble();
				calculo2 = (f - 32) * 1.8;
				System.out.printf(f +" Fº em Celcius é: %.2f%n", calculo2);
			break;		
		}
		
		sc.close();

	}

}
