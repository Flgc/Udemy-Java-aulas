/*
Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar 
as áreas destas figuras na mesma ordem em que foram digitadas

Exemplo:


Enter the number of shapes: 2
Shape #1 data:
Rectangle or Circle (r/c)? r
Color (BLACK/BLUE/RED): BLACK
Width: 4.0
Height: 5.0
Shape #2 data:
Rectangle or Circle (r/c)? c
Color (BLACK/BLUE/RED): RED
Radius: 3.0

SHAPE AREAS:
20.00
28.27

*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;
import entities.Circle;
import entities.Sharpe;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		List<Sharpe> list = new ArrayList<>(); //Polimorfimos com a lista do tipo da super classe

		System.out.print("Enter the number of shapes: ");
		int n = read.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Sharpe #" + i + " data: ");
			
			System.out.print("Retangle of Circle (r/c)? ");
			char ch = read.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/READ: ");
			Color color = Color.valueOf(read.next());		//Converte a palavra digitada para objeto do tipo enumerado color

			
			if (ch == 'r') {								//Fará a leitura de todas as figuras até acabar
				System.out.print("Width: ");
				double width = read.nextDouble();
				
				System.out.print("Height: ");
				double height = read.nextDouble();
				
				list.add(new Rectangle(color, width, height));
				
			}
			else {
				System.out.print("Radius: ");
				double radius = read.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for (Sharpe shape : list) {
			System.out.printf(String.format("%.2f", shape.area()));
		}

		read.close();
	}

}
