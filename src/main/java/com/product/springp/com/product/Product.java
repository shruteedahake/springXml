package com.product.springp.com.product;

public class Product {
	int prodId;
	String prodName;
	double prodPrice;
	
	Cart cart;
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
}
