package application;

import java.util.Scanner;

import entities.triangle;

class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		triangle x, y; 
		
		x=new triangle();
		y=new triangle();
		
		System.out.println("Digite o valor dos lados do triangulo X");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite o valor dos lados do triangulo Y");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Resultado da area de X:%.4f\n", areaX);
		System.out.printf("Resultado da area de Y:%.4f\n", areaY);
		
		sc.close();

	}

}
