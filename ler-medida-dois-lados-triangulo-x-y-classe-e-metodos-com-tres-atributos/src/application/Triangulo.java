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
 *---------   OBS: SOLUÇÃO COM INCLUSÃO COM OBJETO E 3 ATRIBUTOS PARA O TRIANGULO */

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;		//Iniciando as váriavéis do tipo Triangle
		
		x = new Triangle(); //Instanciando o Objeto X nas variáveis
		y = new Triangle();	//Instanciando o Objeto Y nas variáveis
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();	//Guarda no atributo "a" do objeto "x"
		x.b = sc.nextDouble();	//Guarda no atributo "b" do objeto "x"
		x.c = sc.nextDouble();	//Guarda no atributo "b" do objeto "x"
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();	//Guarda no atributo "a" do objeto "y"
		y.b = sc.nextDouble();	//Guarda no atributo "b" do objeto "y"
		y.c = sc.nextDouble();	//Guarda no atributo "c" do objeto "y"
		
		//Cálculo da área do triângulo X e Y utilizando um metodo
		Double areaX = x.area();		
		Double areaY = y.area();
		
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
