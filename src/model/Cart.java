package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cart {
	private List<Product> orderList = new ArrayList<>();
	public static List<CartItem> cartItemList = new ArrayList<>();
	
	private HashMap<String, CartItem> cartItems = new HashMap<String, CartItem>();

	public Cart(){
	}
	
	public List<Product> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Product> orderList) {
		this.orderList = orderList;
	}
	
	public void addProduct(CartItem entity) {

		if(cartItems.containsKey(entity.getProductId())){
			int quantity = entity.getQuantity();

			cartItems.get(entity.getProductId()).setQuantity(quantity);
			
			System.out.println(cartItems.get(entity.getProductId()).getQuantity());
			cartItems.put(entity.getProductId(), cartItems.get(entity));
			
		}
		else {
			cartItems.put(entity.getProductId(), entity);
		}
		
		
	}
	
	public void removeProduct(Product entity) {
		int entityIndex = orderList.indexOf(entity);
		orderList.remove(entityIndex);
	}
	
	public String toString() {
        return "Cart{" + "orderList=" + orderList + '}';
    }
}
