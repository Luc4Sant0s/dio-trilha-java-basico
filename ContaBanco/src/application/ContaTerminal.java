package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();
		System.out.print("Por favor, digite o numero da conta: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Por favor, digite o número da Agência: ");
		String agencia = scanner.next();
		System.out.print("Por favor, insira o saldo inicial: ");
		double saldo = scanner.nextDouble();
		
		
		Conta conta = new Conta();
		conta.setNumero(numeroConta);
		conta.setAgencia(agencia);
		conta.setNomeCliente(nomeCliente);
		conta.setSaldo(saldo);
		
		System.out.println(conta.tostring());
		
		
		
		scanner.close();
	}

}
