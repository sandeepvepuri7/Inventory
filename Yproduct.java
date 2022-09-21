package project2;


import java.util.Scanner;
/**
 * ask of the number of qunity 
 * @author sandeep
 * chaeack if they enfoge of the discount
 * if 100 to 500 give 5% discount 
 *  if 500 too 1500 give 15% discount
 *  1500 or more gets a discount of 25%
 *  @return  the prive in this case total 
 */
public class Yproduct {
	double num1 = 0.15;
	double num2 = 0.25;
	Scanner keyboard = new Scanner(System.in);
	
	
	public double choice1() {
		double dis = 1.0;
		
		System.out.print("the Number of units:");
		int choice = keyboard.nextInt();
		if (choice >= 100 && choice <=500) {
			dis = .95;
			
		} else if (choice >= 500 && choice <= 1500) {
			dis = .85;
		
		}
		else if(choice >= 1500 ) {
			dis = .75;
			
		}
	
		double total= choice * num1*dis ;
		return  total; 
	}
	/**
	 * ask of the number of qunity 
	 * @author sandeep
	 * chaeack if they enfoge of the discount
	 * if 100 to 500 give 5% discount 
	 *  if 500 too 1500 give 15% discount
	 *  1500 or more gets a discount of 25%
	 *  @return  the prive in this case total1 
	 */
	public double choice2() {
		System.out.print("the Number of units :");
		int choice = keyboard.nextInt();
		double total1 = choice * num2;
		
		return total1; 
	}

}