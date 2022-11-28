package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> orderList = new ArrayList<>();

	public Cart(){
	}
	
//	public Product addProduct() {
//		Product p = new Product();
//		orderList.add(p);
//		return p;
//	}
	
	public List<Product> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Product> orderList) {
		this.orderList = orderList;
	}
	
	public void addProduct(Product entity) {
		orderList.add(entity);
	}
	
	public void removeProduct(Product entity) {
		int entityIndex = orderList.indexOf(entity);
		orderList.remove(entityIndex);
	}
	
	public String toString() {
        return "Cart{" + "orderList=" + orderList + '}';
    }
}
