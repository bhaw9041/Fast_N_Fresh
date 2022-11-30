package model;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Product {
	
	private int productId;
	private String productName;
	private int quantity;
	private double price;

	public static ArrayList<Product> productList = new ArrayList<>();
	private String itemTotalValue;
	
	DecimalFormat df = new DecimalFormat("0.00");
    
	public Product(int productId, String name, int quantity, double price) {
        this.productId = productId;
        this.productName = name;
        this.quantity = quantity;
        this.price = price;
        this.setItemTotalValue();
    }
	

	public Product() {	
    }
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		setItemTotalValue();
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


	public String getItemTotalValue() {
		return itemTotalValue;
	}


	public void setItemTotalValue() {
		this.itemTotalValue = df.format((double) this.quantity * this.price);
	}
	
}
