package application;

import java.util.Scanner;

public class Program{
	public static final double PI = 3.14159; 
	
	/* 
	o PI nesse caso é um membro estatico, e a palavrinha final significa que ele nunca vai mudar o valor.
	Por convenção, as constantes tem nome 100% maiusculo e quando tem mais de uma palavra, dividimos por underline
	*/
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n",c);
		System.out.printf("Volume: %.2f",v);
		System.out.printf("PI: %.2f",PI);
		
		sc.close();
	}
	
	public static double circumference(double radius){
		return 2 * PI * radius;
	}
	
	public static double volume(double radius){
		return 4 * PI * (radius * radius * radius)/3;
	}}