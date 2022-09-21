	package project2;
	
	import java.util.Scanner;
	
	public class Xproduct {
	double num1 = 3.00;
	double num2 = 5.99;
	Scanner keyboard = new Scanner(System.in);
	
	/**
	 * ask of the number of qaunity 
	 * times qaunity with the price set for 1 
	 *  @return  the price in this case total 
	 */
	public double choice1() {
		System.out.print("the Number of units: ");
		int choice = keyboard.nextInt();
		double total =  num1 * choice; 
		return total; 
	}
	/**
	 * ask of the number of qaunity 
	 * times qaunity with the price set for 1 
	 *  @return  the price in this case total 
	 */
	public  double choice2() {
		System.out.print("the Number of units :");
		int choice = keyboard.nextInt();
		double total1 = num2 * choice; 
		return total1;
	}
	
	}
