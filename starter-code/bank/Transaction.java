import java.util.Arrays;
import java.util.Scanner;
class Transaction{
	private double trans[];
	/*
		Initialize the array. 
	*/
	public void intialize(int trans_ct){
		trans = new double[trans_ct];
	}
	public void setTrans(int trans_ct){
		/*
			Add your logic here to load the trans array.
		*/
		
	}
	public double[] getTrans(){
		return this.trans;
	}
	public double maxTrans(){
		double res = 1.0;
		
		/*
			Read trans array and find the maximum transaction here. 	
		*/
		return res;
	}
	public double minTrans(){
		double res = 1000000.0;
		
		/*
			Read trans array and find the minimum transaction here. 	
		*/
		return res;
	}
	public double avgTrans(){
		double res = 0.0;
		/*
			Read trans array and find the average transaction here. 	
		*/
		return res;
	}

}