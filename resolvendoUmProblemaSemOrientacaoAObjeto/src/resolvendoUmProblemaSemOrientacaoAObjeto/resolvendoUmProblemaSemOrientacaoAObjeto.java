package resolvendoUmProblemaSemOrientacaoAObjeto;

import java.util.Scanner;

public class resolvendoUmProblemaSemOrientacaoAObjeto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double xa,xb,xc,ya,yb,yc,areaX,areaY;
		
		double p = 0, py =0;
		
		System.out.println("Enter the measures of triangle X:");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		
		p = (xa+xb+xc)/2;
		areaX = Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
		
		System.out.println("Enter the measures of triangle Y:");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		py = (ya+yb+yc)/2;
		areaY = Math.sqrt((py*(py-ya)*(py-yb)*(py-yc)));
		
		System.out.printf("Triangle X area: %.4f%n ", areaX);
		System.out.printf("Triangle Y area:%.4f%n ", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area is X");
		}else {
			System.out.println("Larger area is Y");
		}
		sc.close();
	}
}
