// Dividindo X por Y

/* Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão. */

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
    public static void main(String[] args) throws IOException {
		//complete os espaços com sua solução
    Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		
		int X, Y;
		
		for (int i = 0; i < N; i++) {
  		X = leitor.nextInt();
  		Y = leitor.nextInt();
  		
  		if (Y == 0) System.out.println("divisao impossivel");
  		else System.out.printf("%.1f\n" ,(double) X / Y);
  	  }
    }
}