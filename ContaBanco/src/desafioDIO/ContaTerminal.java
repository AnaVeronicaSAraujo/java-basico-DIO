package desafioDIO;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Número da Conta: ");
		int numeroConta = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Número da Agência: ");
		String agencia = scanner.nextLine();

		System.out.println("Nome do cliente: ");
		String nomeCliente = scanner.nextLine();

		System.out.println("Saldo da conta: ");
		double saldo = scanner.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
				", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
	}
}

