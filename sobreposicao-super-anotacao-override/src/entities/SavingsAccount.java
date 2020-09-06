package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;	//taxa de juros
	
	public SavingsAccount() {
		super();
	}
	
	// Generated Automatic from Account class argument
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);	// Apontado para os argumentos da super classe Account
		this.interestRate = interestRate;
	}

	// Generated Automatic getters and Setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {	//Operação que atualiza o saldo da conta com base na taxa de juros
		balance+= balance*interestRate;
	}
	
	@Override								//Sobrescreve o método da super classe 
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
