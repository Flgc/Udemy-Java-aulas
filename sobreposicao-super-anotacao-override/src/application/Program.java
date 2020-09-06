package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Fabio ", 3000.0);
		acc1.withdraw(300.0);								//Realizou saque da conta
		System.out.println(acc1.getBalance());				//saldo
		
		//Testando a sobreposição
		Account acc2 = new SavingsAccount(1002, "Marcos", 2000.0, 0.02);
		acc2.withdraw(500.0);								// Realizou saque da conta
		System.out.println(acc2.getBalance());				// saldo sem desconto
		
		//Testando a sobreposição
		Account acc3 = new BusinessAccount(1003, "Vitor", 1000.0, 500.0);
		acc3.withdraw(200.0);								// Realizou saque da conta
		System.out.println(acc3.getBalance());				// saldo com os descontos da classe Account e BusinessAccount

	}
}
