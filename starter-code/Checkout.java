/*
Add you honor code here ...
*/

import java.util.Scanner;
public class Checkout{
	public static void main(String[] args){
		ShoppingCart obj = new ShoppingCart();
		System.out.println("Welcome to the online shopping portal");
		System.out.println("------------------------------------------------");
		while(true){	
			Scanner scan = new Scanner(System.in);
			System.out.println("Tell us what did you shop?");
			System.out.println("Enter item name:");
			String name = scan.nextLine();
			System.out.println("Enter item price:");
			double price = scan.nextDouble();
			System.out.println("Enter item quantity:");
			int quantity = scan.nextInt();
			
			obj.addItemToCart(quantity, name, price);
			System.out.println("------------------------------------------------");
			System.out.println("Total price so far:" + obj.getTotalPrice());
			System.out.println("------------------------------------------------");

			System.out.println("Do you want to checkout? (y/n)");
			char ck = scan.next().charAt(0);
			ck = Character.toLowerCase(ck);
			if (ck == 'n')
				continue;
			else{
				obj.displayItemsDuringCheckout();
				System.out.println("Please pay:" + obj.getTotalPrice());
				System.out.println("------------------------------------------------");				
				break;
			}
		}
	}
}