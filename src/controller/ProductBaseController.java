package controller;

import java.util.HashMap;
import java.util.Map;

import model.Cart;
import model.Product;

public abstract class ProductBaseController {
		public static Cart cart = new Cart();
		public static Map<String, Product> inventoryItems = new HashMap<String, Product>();
		public static String userId="";
		
		public void logOff() {
			cart.clearCart();
			inventoryItems.clear();
		}
}
