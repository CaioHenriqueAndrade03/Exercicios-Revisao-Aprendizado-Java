
public class Ex001 {
	public static void main(String[] args) {
		String product1, product2;
		int age,code;		
		char gender;
		double price1, price2, measure;
		
		product1 = "Computer";
		product2 = "Office desk";
		
		age = 30;
		code = 5290;
		
		gender = 'F';
		
		price1 = 2100.0;
		price2 = 650.50;
		measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("Computer, wich price is $%.2f%n",price1);
		System.out.printf("Office desk, wich price is $%.2f%n",price2);
		System.out.println();
		System.out.printf("Record %d years old, code %d and gender %c%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n",measure);
		System.out.printf("Rouded(three decimal places) %.3f%n",measure );
	
	}
}
