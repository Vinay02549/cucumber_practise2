package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	/* Test Driven Approach Concept..
	 * here using constructor for this productNmae and price
	 * If you want to define some values at the RunTime generate getters and setters for this 2 variables 
	 * Make them private so that i can use the encapsulation.
	 * and creating a method for product list of ArrayList.. concept.
	 */
	
	private String productName;
	private int price;
	
	public Product(String productName, int price) {
		
		this.productName = productName;
		this.price = price;
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> productList = new ArrayList<>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple MacBook 12");
		return productList; 

		}
}
