package exercicio3OrientacaoAObjeto;

public class Aluno {
	String Name;
	double nota1;
	double nota2;
	double nota3;
		
	public void Verificar() {
		System.out.println("Final Grade: "+ (nota1+nota2+nota3));
		if(nota1+nota2+nota3<60) {
		 System.out.println("FAILED");	
		 System.out.printf("Missing %.2f points",(60 - (nota1+nota2+nota3)));
		}else {
			System.out.println("PASS");
		}
	}
}
