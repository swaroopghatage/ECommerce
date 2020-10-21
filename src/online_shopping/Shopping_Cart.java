package online_shopping;

public class Shopping_Cart {
	private int cart_id;
	private int number_of_Product;
	private double Price;
	private double Total_Price;
	
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getNumber_of_Product() {
		return number_of_Product;
	}
	public void setNumber_of_Product(int number_of_Product) {
		this.number_of_Product = number_of_Product;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getTotal_Price() {
		return Total_Price;
	}
	public void setTotal_Price(double total_Price) {
		Total_Price = total_Price;
	}
	
	

}
