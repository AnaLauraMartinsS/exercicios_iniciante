package exercicios_iniciante;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um número de tabuada de 1 a 10: ");
		num = sc.nextInt();
		
		for(int i = 1; i <=10; i++) {
			System.out.println(num + " * " + i + " ="+ num*i);
		}
		sc.close();

	}

}
