package exercicios_iniciante;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		int x, fatorial = 1;
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Digite números que você deseja calcular: ");
		x = sc.nextInt();
		
		if(x >= 0) {
			for(int i = 1; i<=x; i ++) {
				fatorial = fatorial * i;
			}
			System.out.println("O fatorial é: " + fatorial);
			
		}else {
			System.out.println("Informe valores iguais a zero ou acima de zero");
		}
		
		sc.close();

	}

}
