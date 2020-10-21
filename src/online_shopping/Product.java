package online_shopping;

public class Product {
	private int Product_id;	
	private String Product_name;	
	private double Product_price;
	private String Product_group;
	
	void Available_stock()
	{
		
	}

	public int getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}

	public String getProduct_name() {
		return Product_name;
	}

	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	public double getProduct_price() {
		return Product_price;
	}

	public void setProduct_price(double product_price) {
		Product_price = product_price;
	}

	public String getProduct_group() {
		return Product_group;
	}

	public void setProduct_group(String product_group) {
		Product_group = product_group;
	}
	
}
