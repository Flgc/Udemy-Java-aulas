//@author Professor Nelio alves - Curso Java Completo 2020

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * / Testa operações bit a bit com operadores
		 *  
		 *  & == Operação "E"  			 bit a bit
		 *  | == Operação "OU"           bit a bit
		 *  ^ == Operação "OU-exclusivo" bit a bit
		 */
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		System.out.println("");
		
		// Testar se o 6º bit da operação vale 1
		
		Scanner sc = new Scanner(System.in);
		
		int mask  = 32;         //32 possui o 6º bit igual a 1 - com número inteiro
		int maskb = 0b100000;   //32 possui o 6º bit igual a 1 - com número binário
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		if((n & mask) != 0) {						//Essa condição verifica se o número digitado comparado
													// a mask que vale 32 e tem o 6 bit = 1 são iguais
			System.out.println("6th bit is true!");
		}else {
			System.out.println("6th bit is false!");
		}
		sc.close();
	}
}
