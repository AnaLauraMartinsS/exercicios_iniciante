package exercicios_iniciante;

import java.util.Scanner;

public class Regressiva {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		num = sc.nextInt();
		for(int i = num; i >= 1; i --) {
			System.out.print(i+ ",");
		}
		sc.close();

	}

}
