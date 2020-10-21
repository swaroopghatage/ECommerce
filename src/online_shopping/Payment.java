package online_shopping;

public class Payment {

	private int Payment_id;
	private int number_of_Product;
	private double Price;
	private double Total_Price;
	
	void payment_Details()
	{
		
	}
	void Invoice()
	{
		
	}
	public int getPayment_id() {
		return Payment_id;
	}
	public void setPayment_id(int payment_id) {
		Payment_id = payment_id;
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
