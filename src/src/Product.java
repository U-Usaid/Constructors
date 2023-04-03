package src;

public class Product {

	String product;
	double price;
	
	Product(String  productName, double productPrice){
		this.product = productName;
		this.price = productPrice;
	}
	
	public String getName() {
		return product;
	}
	
	public double getPrice() {
		return price;
	}
}
