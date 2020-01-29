import java.util.Scanner;
import java.util.Arrays;
public class TransactionStub{
	public static void main(String[] args){
		Transaction obj = new Transaction();
		System.out.println("Welcome. Enter the no of transactions:");
		Scanner scan = new Scanner(System.in);
		int trans_ct = scan.nextInt();
		obj.intialize(trans_ct);
		/*
			Add your logic here.
		*/
		obj.setTrans(trans_ct);
		/*
		Arrays toString function is used to print an array 
		contents in the console. 
		*/
		System.out.println("Transaction List:" + Arrays.toString(obj.getTrans()));
		System.out.println("Min Transaction:" + obj.minTrans());
		System.out.println("Max Transaction:" + obj.maxTrans());
		System.out.println("Avg Transaction:" + obj.avgTrans());


	}
}