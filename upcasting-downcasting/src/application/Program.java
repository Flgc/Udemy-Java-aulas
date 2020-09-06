package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Fabio ", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002,"Fabiola", 0.0, 500.0);
		
		//Sample UPCASTING
		Account acc1 = bacc;		//Exemplo 1 - Recebendo Objeto da super class(Account) recebendo objeto da BusinessAcconunt
		Account acc2 = new BusinessAccount(1003, "Andrea", 0.00, 600.0);	//Exemplo 2 - Atribuindo objeto da classe para super classe  
		Account acc3 = new SavingsAccount(1004, "Carlos", 0.0, 0.01); //Exemplo 3
	
		//Sample DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2; //Exemplo 1 - (BusinessAccount) representa a conversão do Downcasting
		acc4.loan(100.0);
		
		if (acc3 instanceof BusinessAccount) {	//Exemplo 2 - instanceof -> Testa se realmente é do mesmo tipo (instancia) 
			BusinessAccount acc5 = (BusinessAccount)acc3; //Só foi possível o casting mediante a verificação anterior (if)
			acc5.setLoanLimit(200.0); //Realiza operação de empréstimo
			System.out.println("Sucessifull loan!");
		}
		
		if (acc3 instanceof SavingsAccount){ //Exemplo 3 - Testa se é do mesmo tipo
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
