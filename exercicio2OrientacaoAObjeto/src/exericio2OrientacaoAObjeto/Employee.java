package exericio2OrientacaoAObjeto;

public class Employee {
	String name;
	double GrossSalary;
	double Tax;
	double Salary;

	
	public double NetSalary() {
		
		return GrossSalary - Tax; 
	}
	
	public void IncreaseSalary(double percent) {
		GrossSalary = GrossSalary*(1+(percent/100));	
	}
	
	public String toString() {
		return "Employee: "+ name + " , $" + String.format("%.2f", NetSalary());
	}
	
}
