package exercicios_iniciante;

import java.util.Scanner;

public class Calculadora_simples {

	public static void main(String[] args) {
		
		double num1, num2, soma, sub, mult, div;
		int op;
		
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Digite o primeiro valor: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		num2 = sc.nextDouble();
		
		System.out.println("------- ESCOLHA UMA DAS OPEAÇÕES -----");
		System.out.println("[1] - SOMA ");
		System.out.println("[2] - SUBTRAÇÃO ");
		System.out.println("[3] - MULTIPLICAÇÃO ");
		System.out.println("[4] - DIVISÃO ");
		System.out.println(" -> Digite sua opção abaixo! <-");
		op = sc.nextInt();
		
		switch(op) {
			case 1:
				soma = num1 + num2;
				System.out.println("A soma dos dois valore é: "+ soma);
			break;
		
			case 2:
				sub = num1 - num2;
				System.out.println("A subtração desses dois valore é: " + sub);
			break;
			
			case 3:
				mult = num1 * num2;
				System.out.println("A multiplicação dos dois valores é:" + mult);
			break;
			
			case 4:
				//se a váriavel num1 for maior que a num2, não será possível realizar o cálculo de divisão
				if(num1 < num2) {
					System.out.println("Não é possível realizar o cálculo!");
				}else {
				div = num1 / num2;
				System.out.println("A divisão desses dois valores é: "+ div);
				}
			break;
			
			default:
				System.out.println("Operação invalida!");
		}
		
		sc.close();
	}

}
