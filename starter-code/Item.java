/*
Add you honor code here ...
*/
import java.text.NumberFormat;
public class Item{
	private int quantity;
	private String name;
	private double price;
	/*
	Step 1 - add constructor to initialize the members of this class.
	*/

	Item(int quantity, String name, double price){
		/*
		Add constructor code here ...
 		*/

	}

	/*
	Step 2 - add getters to retrieve the value connected to 
	the members of this class. 
	*/

	/* 
		Stringify the results to be displayed to the user 
		based on the item properties.
	*/
	public String toString()
 	{
 		NumberFormat fmt = NumberFormat.getCurrencyInstance();
 		return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
 		+ fmt.format(price*quantity));
 	}


}
