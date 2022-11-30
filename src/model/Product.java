package model;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Product {
	
	private int quantity;
	private double price;
	private String productName;
	private String productId;

	public static ArrayList<Product> productList = new ArrayList<>();
	
	public Product(String productId, String productName, int quantity, double price){
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
}
