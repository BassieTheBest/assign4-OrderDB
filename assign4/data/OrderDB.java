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
		orderArray = new Order[numLines];
		
		
		
		try {
			Scanner scanner = new Scanner(orders);
			String line = scanner.nextLine();
			String id = "";
			String pro = "";
			String amount = "";
			int place = 0;
			
			while(scanner.hasNextLine()) {
				line = scanner.nextLine();
				
				int placeHolder = 0;
				String temp = "";
				for (index = 0; index<line.length();index++) {
					if (line.charAt(index) != ',') {
						temp += line.charAt(index);
					}
					else {
						if (placeHolder == 0) {
							id = temp;
						}
						else if (placeHolder == 2) {
							pro = temp;
						}
						else if (placeHolder == 3) {
							amount = temp;
						}
						temp = "";
						placeHolder++;
					}
					
				}
				orderArray[place] = new Order(id, pro, amount);
				place++;
				
				
			}
			scanner.close();
		}
		catch (FileNotFoundException n) {
			System.out.print("Loser");
		}
		
		
		
		
		}
		


	public void showOrders() {
		System.out.printf("Order ID Product\t\t\tTotal Amt\n");
		System.out.printf("-------- -------\t\t\t---------\n");
		
		for (Order pl : orderArray) {
			System.out.printf("%-7s%-34s%s\n", pl.getID(), pl.getProduct(),pl.getAmount());
			}
		
	}
}
