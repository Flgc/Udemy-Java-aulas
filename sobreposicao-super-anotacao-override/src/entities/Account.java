package entities;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account(){
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// Generated Automatic Getters and Setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {			//Operação de saque com o desconto da taxa (5.0)
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {			//Operação de deposito
		balance += amount;
	}
	
}
