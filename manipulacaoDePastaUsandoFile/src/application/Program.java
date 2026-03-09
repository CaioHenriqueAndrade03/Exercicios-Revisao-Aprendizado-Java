package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		System.out.println("Digite o path da pasta:");
		String folderPath = sc.nextLine(); 
		File path = new File(folderPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		if (folders != null) {
			System.out.println("Folders:");
			for (File folder : folders) {
				System.out.println(folder);
			}
		} 
		else {
			System.out.println("Arquivo nao existe ou não é uma pasta");
		}
		
		File[] files = path.listFiles(File ::isFile);
		
		System.out.println("Files:");
		for(File file : files){
			System.out.println(file);
		}
		
		boolean success = new File(folderPath + "\\subdir").mkdir();
		
		System.out.println("Diretorio criado com sucesso " + success);
		sc.close();
	}
}