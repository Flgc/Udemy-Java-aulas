/*
 * 
 * @author Professor Nelio alves - Curso Java Completo 2020
 * 
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
 * Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui 
 * a maior área.
 * 
 * A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c 
 * é a seguinte (fórmula de Heron):
 * 
 * area = Raiz(p ( p - a )( p - b )( p - c ))
 * 
 * onde
 * 
 * p = (a + b + c) / 2
 * 
 * ------------------   OBS: SOLUÇÃO SEM ORIENTAÇÃO A OBJETO
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		Double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		Double p = (xA + xB + xC) / 2.0;
		Double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		Double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		sc.close();
	}
}
