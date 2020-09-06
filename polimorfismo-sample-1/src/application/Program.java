/*
	 Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
	podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
	bem como o total de imposto arrecadado.
	
	Os dados de pessoa física são: 
	nome, renda anual e gastos com saúde.
	
	Os dados de pessoa jurídica	são:
	nome, renda anual e número de funcionários. 
	
	As regras para cálculo de imposto são as seguintes:
	Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
	renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
	destes gastos são abatidos no imposto.
	
	Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
	fica: (50000 * 25%) - (2000 * 50%) = 11500.00
	
	Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
	funcionários, ela paga 14% de imposto.
	
	Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
	400000 * 14% = 56000.00
	
	
		Enter the number of employees: 3
		Employee #1 data:
		Outsourced (y/n)? n
		Name: Alex
		Hours: 50
		Value per hour: 20.00
		Employee #2 data:
		Outsourced (y/n)? y
		Name: Bob
		Hours: 100
		Value per hour: 15.00
		Additional charge: 200.00
		Employee #3 data:
		Outsourced (y/n)? n
		Name: Maria
		Hours: 60
		Value per hour: 20.00

		PAYMENTS:
		Alex - $ 1000.00
		Bob - $ 1720.00
		Maria - $ 1200.000
*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = read.nextInt();

		for (int line = 1; line <= n; line++) {
			System.out.println("Employee #" + line + " data: ");

			System.out.print("Outsorced (y/n)? ");
			char ch = read.next().charAt(0);

			System.out.print("Name: ");
			read.nextLine(); // Limpa a quebra de linha
			String name = read.nextLine();

			System.out.print("Hours: ");
			int hours = read.nextInt();

			System.out.print("Value per hour: ");
			double valuePerHour = read.nextDouble();

			if (ch == 'y') {									//Aplicação do polimormismo
				System.out.print("Additional charge: ");
				double additionalCharge = read.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");

		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		read.close();
	}
}
