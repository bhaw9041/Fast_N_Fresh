package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cart {
	
	private HashMap<String, CartItem> cartItems = new HashMap<String, CartItem>();

	public Cart(){
	}
	
	public List<CartItem> getCartItems() {
		List<CartItem> itemsList = new ArrayList();
		for(String id: cartItems.keySet()) {
			itemsList.add(cartItems.get(id));
		}
		return itemsList;
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
	
}
