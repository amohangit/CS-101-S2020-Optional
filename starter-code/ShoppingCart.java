/*
Add you honor code here ...
*/

public class ShoppingCart{
	// total number of items in the cart
	private int itemCount; 
 	// total price of items in the cart
 	private double totalPrice; 
 	// current cart capacity
 	private int capacity; 
 	private Item[] cart;
 	/* 
 	Step 1 - create a constructor
 	*/
 	public ShoppingCart(){
 		/*
		Add constructor code here ...
 		*/

 	}
 	/* 
 	Step 2 - add an item to the Shopping Cart
 	*/
 	public void addItemToCart(int quantity, String name, double price){
 		
 	}
 	/* 
 	Step 3 - add the required logic to increase the size of 
 	the structure. 
 	*/
 	public void increaseCartSize(){
 		
 	}
 	public double getTotalPrice(){
 		return this.totalPrice;
 	}
 	public void displayItemsDuringCheckout(){
 		System.out.println("------------------------------------------------");
		for(int i = 0; i < itemCount; i++){
 			System.out.println(cart[i].toString());
 			System.out.println("------------------------------------------------");
 		}
 	}
}