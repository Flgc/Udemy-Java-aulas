import java.util.Locale;
import java.util.Scanner;

/**
 * @author Professor Nelio alves - Curso Java Completo 2020
 *
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de telefone.
Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a 
quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
 */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Double preco, exed, qtd;		
		int minuto;
		
		minuto=100;
		preco=50.0;
		exed=2.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantos minutos utilizado:");
				
		qtd = sc.nextDouble();
		
					   /* Condição */           /* Verdadeiro */          /* Falso */
		Double total = (qtd > minuto) ? ((qtd - minuto) * exed) + preco : preco;

		System.out.printf("Valor total a pagar R$: %.2f%n", total);
		
		sc.close();		
	}

}
