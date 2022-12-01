package controller;

import java.util.HashMap;
import java.util.Map;

import model.Cart;
import model.Product;

public abstract class ProductBaseContoller {
		public static Cart cart = new Cart();
		public static Map<String, Product> inventoryItems = new HashMap<String, Product>();
}
