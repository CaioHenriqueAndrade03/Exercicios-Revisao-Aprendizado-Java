package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o path da pasta: ");
        String strPath = sc.nextLine();

        File folder = new File(strPath);

        // 1️⃣ Encontrar arquivos CSV
        File[] files = folder.listFiles(
            file -> file.isFile() && file.getName().toLowerCase().endsWith(".csv")
        );

        if (files != null && files.length > 0) {

            File sourceFile = files[0]; // pega o primeiro CSV encontrado
            System.out.println("Arquivo encontrado: " + sourceFile.getName());

            // 2️⃣ Criar pasta "out"
            File outFolder = new File(folder, "out");
            if (!outFolder.exists()) {
                outFolder.mkdir();
            }

            // 3️⃣ Criar arquivo de saída
            File targetFile = new File(outFolder, "summary.csv");

            try (
                Scanner fileScanner = new Scanner(sourceFile);
                PrintWriter writer = new PrintWriter(targetFile)
            ) {

                // 4️⃣ Ignorar cabeçalho original
                if (fileScanner.hasNextLine()) {
                    fileScanner.nextLine();
                }

                // 5️⃣ Escrever novo cabeçalho
                writer.println("nome,preco");

                // 6️⃣ Ler cada linha e escrever apenas nome e preco
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] fields = line.split(",");

                    if (fields.length >= 2) {
                        String nome = fields[0];
                        String preco = fields[1];

                        writer.println(nome + "," + preco);
                    }
                }

                System.out.println("Arquivo gerado com sucesso em: " + targetFile.getPath());

            } catch (FileNotFoundException e) {
                System.out.println("Erro ao processar arquivo: " + e.getMessage());
            }

        } else {
            System.out.println("Nenhum arquivo CSV encontrado.");
        }

        sc.close();
    }
}