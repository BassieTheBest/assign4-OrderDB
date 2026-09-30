package data;

public class Driver {

	public static void main(String[] args) {
		
		OrderDB attemp = new OrderDB();
		attemp.loadOrders("orders.txt");
		attemp.showOrders();
		
		
	}

}