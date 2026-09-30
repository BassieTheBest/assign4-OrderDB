package data;

public class Order {
	private String orderID;
	private String custName;
	private String product;
	private String totalAmount;
	private String date;
	
	public void setID(String orderID) {
		this.orderID = orderID; 
	}
	public String getID() {
		return orderID;
	}
	
	public void setName(String custName) {
		this.custName = custName;
	}
	public String getName() {
		return custName;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	public String getProduct() {
		return product;
	}
	
	public void setAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getAmount() {
		return totalAmount;
	}
	
	public void setdate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	
	
	public Order() {}
	
	public Order(String id, String product, String amount) {
		this.orderID = id;
		this.product = product;
		this.totalAmount = amount;
	}
}



