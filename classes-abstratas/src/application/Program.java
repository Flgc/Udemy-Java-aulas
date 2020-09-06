package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();		//Lista do tipo genbérico da Account poderá utilizar todas

		list.add(new SavingsAccount(1001, "Fabio ", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Vitor", 1000.0, 400.0));	//Adicionando valores as linstas intanciadas
		list.add(new SavingsAccount(1003, "Marcos", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Beto", 500.0, 500.0));

		double sum = 0.0;								
		for (Account acc : list) {
			sum += acc.getBalance();			//Totaliza todos os saldos
		}
		
		System.out.printf("Total balance: %.2f%n", + sum);
		
		
		for (Account acc : list) {
			acc.deposit(10.0);					//Adicionando 10 em todas as contas	
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		sum = 0.0;								
		for (Account acc : list) {
			sum += acc.getBalance();			//Totaliza todos os saldos
		}
		
		System.out.printf("Total balance: %.2f%n", + sum);
		
	}
}
