package exercicios_iniciante;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		String palavra = "";
		String reversa = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a palavra para ser verificada:");
		palavra = sc.next();
		
		for (int i = (palavra.length() -1); i >= 0; i -- ) {
			reversa += palavra.charAt(i);
		}
		
		if(palavra.equals(reversa)) {
			System.out.println("É palindromo");
		}else {
			System.out.println("Não é palindromo !");
		}
		
		sc.close();
	}

}
