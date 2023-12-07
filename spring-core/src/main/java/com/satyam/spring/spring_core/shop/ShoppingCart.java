package com.satyam.spring.spring_core.shop;

public class ShoppingCart {

	private Item cart;

	public Item getCart() {
		return cart;
	}

	public void setCart(Item cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "ShoppingCart [cart=" + cart + "]";
	}

}
