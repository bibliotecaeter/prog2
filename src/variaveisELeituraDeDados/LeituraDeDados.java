package variaveisELeituraDeDados;

import java.util.Scanner;

public class LeituraDeDados {
	
	public static void main(String[] args) {
		// Inicializando o Scanner
		Scanner scan = new Scanner(System.in);
		
		// Lendo e imprimindo uma String: o nome completo
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		// Lendo e imrpimento uma String: o primeiro nome
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		// Lendo e imprimindo um inteito: a idade
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		// Lendo e imprimindo um Double: a altura
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura �: " + altura);		
	
	}

}
