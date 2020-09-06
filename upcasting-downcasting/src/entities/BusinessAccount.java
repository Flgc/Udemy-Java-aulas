package entities;

public class BusinessAccount extends Account { // Herda os dados (atributos e métodos) e comportamento da classe Account

	private Double loanLimit;

	public BusinessAccount() {
	}

	// Generated Automatic from Account class argument
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Apontado para os argumentos da super classe Account
		this.loanLimit = loanLimit;
	}

	// Generated Automatic getters and Setters
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) { // Operação de emprestimo
		if (amount <= loanLimit) {	  // Verifica limite disponível
			balance +=amount - 10.0;  // Exemplo de operação possível por se tratar de um atributo protected da class Account
		}
	}

}