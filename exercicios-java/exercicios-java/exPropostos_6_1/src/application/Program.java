package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Informe o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Informe o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Deseja fazer dep�sito inicial?(s/n)");
		char escolha = sc.next().charAt(0);
		if(escolha == 's') {
			
			System.out.println("Digite o valor do dep�sito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
			
		}else {
			
			conta = new Conta(numeroConta, nomeTitular);
			
		}
		
		System.out.println();
		System.out.println("Informa��es da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para dep�sito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Informa��es da conta atualizadas: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Informa��es da conta atualizadas: ");
		System.out.println(conta);
		
		
	}

}
