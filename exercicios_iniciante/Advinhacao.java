package exercicios_iniciante;

import java.util.Scanner;
import java. util.Random;

public class Advinhacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int num_aleatorio = aleatorio.nextInt(101);
		int tentativas = 0, suposicao;
		
		while(true) {
			System.out.println("Digite seu palpite: ");
			suposicao = sc.nextInt();
			tentativas ++;
			
			if(suposicao < num_aleatorio) {
				System.out.println("Tente um valor maior.");
			}else if (suposicao > num_aleatorio) {
				System.out.println("Tente um valor menor.");
			}else {
				System.out.println("Parabéns você acertou!" + num_aleatorio);
				break;
			}
		}
		sc.close();
	}

}
