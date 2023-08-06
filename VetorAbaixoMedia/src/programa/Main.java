package programa;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores terá o vetor: ");
		int quant = sc.nextInt();
		
		double[] vetor = new double[quant];
		
		for (int i = 0; i < vetor.length; i ++) {
			System.out.printf("Digite seu %d° valor: ", i + 1);
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		double media = 0.0, soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		System.out.println("Média dos valores: " + (soma / vetor.length));
		System.out.println("Valores abaixo da média: ");
		
		for(double x: vetor) {
			if(x < (soma / vetor.length)) {
				System.out.println(x);
			}
		}

		sc.close();
	}

}
