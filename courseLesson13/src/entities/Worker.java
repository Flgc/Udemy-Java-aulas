/*
 * Composições de objetos com base no diagrama de classe em anexo ao projeto
 */

package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	//Basic attributes
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//associations provided for in the project, see class diagram
	
	private Department departament;
	
	//Composição (tem muitos) não pode ser incluso no construtor 
	//Instanciado manualmente por padrão na classe com o ArrayList
	
	private List<HourContract> contracts = new ArrayList<>();	
	
	//Standard constructor
	public Worker() {
	}

	//Arguments constructors generator
	public Worker(String name, WorkerLevel level, Double baseSalary, Department departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	//Get and Sets generator
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * De maneira nenhuma uma lista pode ser alterada, por esse motivo, o set contrato
	 * deve ser excluido, deixei comentado só para lembrar em futuras implementações
	 * essa observação. 
	 * 
	 * public void setContracts(List<HourContract> contracts) {
	 * 	   this.contracts = contracts; 
	 * }
	 */	
	
	// Class methods
	
	// Add my contract to the list	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	// Remove contract from list
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//Calcula quanto ganhou no ano e mes, salario base + o ganho do mes em contratos
	public double income(int year, int month) {
		
		double sum = baseSalary;
		
		//Date handling instance 
		Calendar cal = Calendar.getInstance();
		
		//Testa se o contrato da variavel "c" pertence ao ano e mês informado se for encontrado acrecenta na variavel "sum"
		for (HourContract c : contracts) {
			
			cal.setTime(c.getDate());	//Busca a "data-do-contrato" e define como "data-do-calendário"
			
			int c_year = cal.get(Calendar.YEAR);		//Grava o ano do calendário
			int c_month = 1 + cal.get(Calendar.MONTH); 	//Grava o mês do calendário - Obs(+1 já que Calendar inicia com "0" o calendário)
		
			// Verifica se o o ano e o mês informado no argumento e parametro são iguais
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
}
