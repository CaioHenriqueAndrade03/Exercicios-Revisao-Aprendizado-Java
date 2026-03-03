public class Program {
	public static void main(String[] args) {
		int idade = 22;
		System.out.println("Sua idade é: "+ idade);
		//Tambem podemos formatar uma variavel double para um limite de casas, assim
		double altura = 1.83000003;
		System.out.println("Sua altura inteira é: "+ altura);
		System.out.printf("Sua altura formata em 2 casas decimais é: %.2f%n",altura);
		System.out.printf("Sua altura formatada com 4 casas decimais é: %.4f%n", altura);
	
	}	
}