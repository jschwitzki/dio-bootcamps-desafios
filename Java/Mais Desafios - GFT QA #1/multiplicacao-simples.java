// Multiplicação Simples

/* Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).    */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		PROD = (A * B); //implemente o código que representa a multiplicação.
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}
}