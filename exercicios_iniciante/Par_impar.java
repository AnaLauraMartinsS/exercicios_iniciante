package exercicios_iniciante;

import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		
		int num, parOuImpar;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		parOuImpar = (num%2);
		
		if(parOuImpar == 0) {
			System.out.println("O valor digitado " + num + " é de número par: ");
		}else {
			System.out.println("O valor digitado "+ num + " é de número ímpar");
		}
		
		sc.close();

	}

}