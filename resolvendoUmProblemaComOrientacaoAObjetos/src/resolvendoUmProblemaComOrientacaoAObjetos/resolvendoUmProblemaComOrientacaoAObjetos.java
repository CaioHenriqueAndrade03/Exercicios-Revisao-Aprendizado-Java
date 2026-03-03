package resolvendoUmProblemaComOrientacaoAObjetos;

import java.util.Scanner;

public class resolvendoUmProblemaComOrientacaoAObjetos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double areaX,areaY;
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
				System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
			
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaY = y.area();
		areaX = x.area();	
		
		System.out.printf("Triangle X area: %.4f%n ", areaX);
		System.out.printf("Triangle Y area:%.4f%n ", areaY);
		
		if(x.area() > y.area()) {
			System.out.println("Larger area is X");
		}else {
			System.out.println("Larger area is Y");
		}
		sc.close();
	}
}
