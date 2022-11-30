package model;

import java.util.ArrayList;

public class Product {
	
	private int productId;
	private String productName;
	private int quantity;
	private double price;
	public static ArrayList<Product> productList = new ArrayList<>();
	
	
	public Product(int productId, String name, int quantity, double price) {
        this.productId = productId;
        this.productName = name;
        this.quantity = quantity;
        this.price = price;
    }
	

	public Product() {	
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	@Override
    public String toString() {
        return "Product{" + "productId=" + productId + "productName=" + productName + "quantity=" + quantity + "price=" + price +'}';
    }
	
}
