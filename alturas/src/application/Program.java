package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão registradas? ");
		
		int n =sc.nextInt(); // Variável n recebe o número de pessoas que serão registradas
		
		String[] nomes = new String[n]; // Declarando um Array "nomes", para armazenar os nomes que serão digitados
		int[] idades = new int[n]; //      Declarando um Array "idades", para armazenar as idades que serão digitados
		double[] altura = new double[n];// Declarando um Array "Altura", para armazenar as alturas que serão digitados
		
		for (int i = 0; i<n; i++) { // Criando um laço de repetição para que os dados sejam perguntados aos usuários e armazenados nos respectivos Arrays. 
			
			System.out.println("Dados da " + (i+1) + " pessoa");
			System.out.println("Nome: ");
			nomes[i] = sc.next(); 				// Linha para receber o nome digitado pelo usuário e armazenar no Array correspondente.
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();			// Linha para receber a idade digitada pelo usuário e armazenar no Array correspondente.
			System.out.println("Altura");
			altura[i] = sc.nextDouble();        // Linha para receber a altura digitada pelo usuário e armazenar no Array correspondente.

	}
		double soma = 00;    // variável que ira receber a soma das alturas digitadas pelo usuário.
		
		for (int i = 0; i<n; i++) {  // Criando um laço de repetição para realizar a soma das alturas digitadas.
			soma = soma + altura[i];  // A variável soma recebe ela mesmo mais a altura registrada no índice atual "i".
		}
		double mediaAltura = soma / n; // Varável que calcula a média das alturas, dividindo o total pelo número de pessoas cadastradas.
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAltura);

		int cont = 0;  // variável que ira receber a quantidade de pessoas menores de 16 anos
		
		for (int i = 0; i<n; i++){ // laço derepetição que ira validar se a idade é menor que 16 anos
			if (idades[i] < 16){
				cont = cont +1;  // variável que ira somar ao "cont" o número atual de pessoa menores que 16
			}
		}
		
		double percent = cont * 100.0 / n; // Variável que calcula a porcentagem de pessoas menores que 16 anos
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 0; i<n; i++) { // laço derepetição que ira validar se a idade é menor que 16 anos
			if (idades[i]<16) {
				System.out.println(nomes[i]); // imprime na tela o nomes das pessoas cuja idade é menor que 16 anos.
			}
		}
		
		sc.close();
}
}
