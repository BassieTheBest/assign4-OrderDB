package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrderDB {
	
	private int numLines;
	private Order[] orderArray;
	
	public void loadOrders(String fileName){
		File orders = new File(fileName);
		int index;
		Order name = new Order();
		
		try {
			Scanner scanner = new Scanner(orders);
			String line = scanner.nextLine();
			while(scanner.hasNextLine()) {
				line = scanner.nextLine();
				numLines++;
			}
			scanner.close();
		}
		catch (FileNotFoundException n) {
			System.out.print("Loser");
		}
		
		
		
		try {
			Scanner scanner = new Scanner(orders);
			String line = scanner.nextLine();
			int index1 = 0;
			
			orderArray = new Order[numLines];
			
			 while(scanner.hasNextLine()) {
				line = scanner.nextLine();
				String id = "";
				String product = "";
				String amount = "";
				
				
				String[] temp = line.split(",");
				
				if(index1 == 0) {
					id = temp[numLines];
				}
				else if(index1 == 2) {
					 product = temp[numLines];
				}
				else if(index1 == 3){
					amount = temp[numLines];
				}
					
			orderArray[index1] = Order( id, product, amount);
				index1++;
			}
			scanner.close();
		}
		catch (FileNotFoundException n) {
			System.out.print("Loser");
		}
		
		
		
		}
		
		
			//for (Order index2 : orderArray) {
				//if (index2 != null) {
					//System.out.print(index2.getID() + " " + index2.getName() + " " + index2.getProduct());
				//}
			//}
		
		
		
		//try {
			//Scanner scanner = new Scanner(orders);
			//String line = scanner.nextLine();
			
			//while (scanner.hasNextLine()) {
				//line = scanner.nextLine();
				
			//}
			
			//scanner.close();
			
		//}
		//catch (FileNotFoundException nf) {
			//System.out.print("Loser");
		//}
		


	public void showOrders() {
		int index;
		for(index = 0; index < orderArray.length; index++) {
			System.out.println(orderArray[index].getID());
		}
		
	}
}
