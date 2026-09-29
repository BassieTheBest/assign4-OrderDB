package data;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Order {
	private String orderID;
	private String custName;
	private String product;
	private String totalAmount;
	private String date;
	private String line;
	private int fileCount = 1;
	private int numLines = 0;
	private static String[] splitResult = new String[5];
	File orders = new File("orders.txt");
	
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
	public void setLine(int numLines) {
		
		this.numLines = numLines;
	}
	public int getLine() {
		return numLines;
	}
	
	public Order() {
		
	}
	public Order(String id, String product, String amount) {
		this.orderID = id;
		this.product = product;
		this.totalAmount = amount;
	}
	
	public Order(String orderID, String custName, String product, String totalAmount, String date) {
		this.orderID = orderID;
		this.custName = custName;
		this.product = product;
		this.totalAmount = totalAmount;
		this.date = date;
	}
	
	public void readOneOrder() {
		try {
			Scanner scanner = new Scanner(orders);
			
			int index;
			
			for (index = 0; index < fileCount; index++) {
				line = scanner.nextLine();
			}
            if (scanner.hasNextLine()) {
                line = scanner.nextLine();
                fileCount +=1;
            }
			scanner.close();
		}
		catch (FileNotFoundException nf) {
			System.out.print("Loser");
		}
	}
	
	public static String[] split(String str,char delim) {
		int index;
		int placeHolder = 0;
		String temp = "";
		for (index = 0; index<str.length();index++) {
			if (str.charAt(index) != delim) {
				temp += str.charAt(index);
			}
			else {
				splitResult[placeHolder] = temp;
				temp = "";
				placeHolder++;
			}
		}
		splitResult[placeHolder] = temp;
		return splitResult;
	}
	
	public void doesSome() {
		for (String index : split(line, ',')) {
			System.out.print(index + " asdasd  ");
		}
		System.out.println();
	}
	
/*	public void lineCount() {
		try {
			Scanner scanner = new Scanner(orders);
			line = scanner.nextLine();
			while(scanner.hasNextLine()) {
				line = scanner.nextLine();
				numLines++;
			}
			scanner.close();
		}
		catch (FileNotFoundException n) {
			System.out.print("Loser");
		}
	}*/
	
	public void repeat() {
		int index = 0;
		while (index < numLines) {
			readOneOrder();
			doesSome();
			index++;
		}
	}
}



