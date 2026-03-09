package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	public Double getBasicPayment() {
		return this.basicPayment;
	}
	
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public Double getTax() {
		return this.tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getTax() + getBasicPayment();
	}
	
	@Override
	public String toString() {
	    return String.format(
	        "Pagamento sem a tax: %.2f%nTaxa: %.2f%nPagamento total: %.2f",
	        basicPayment,
	        tax,
	        basicPayment + tax
	    );
	}
}
