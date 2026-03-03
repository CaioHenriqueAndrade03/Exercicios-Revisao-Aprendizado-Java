package testeClasseProduto;

public class Product {
	String name;
	double price;
	int quantity;

	
	public void AddProducts(int quantity) {
		this.quantity+=quantity;		
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity-=quantity;	
	}
	
	public double TotalValueInStock() {
		return quantity * price;
	}
	
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f",TotalValueInStock());
	}
}
