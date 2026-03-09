package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga o path do arquivo");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Pega o nome do arquivo ignorando o path
		System.out.println("getName: " + path.getName());
		
		//Pega path ignorando o nome
		System.out.println("getParent: " + path.getParent());
		
		//Pega todo o caminho
		System.out.println("getPath: " + path.getPath());
		sc.close();
	}
}
