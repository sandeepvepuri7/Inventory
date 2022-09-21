package project2;


import java.util.Scanner;

public class Zproduct  {
	int num1 = 10;
	int num2 = 15;
	Scanner keyboard = new Scanner(System.in);
	int month, year, days; 
	
	public void  aproduct(int month, int year, int days) {
		this.month = month;
		this.year = year; 
		this.days = days;
	}
	/**
	 * look for if step 15 to oct 14
	 * if it bettween those date it would apply the discount 
	 * @return total
	 * else run nommarly 
	 */
	public double choice1() {
		System.out.print("the Number of units :");
		int tot ;
		double total;
		int choice = keyboard.nextInt();
		if(month == 10 && days>=1 || 14 >= days) {
			tot = choice *2/3;	
			tot = tot + choice %3;
			 total = tot * num1  ;
				return total;
			
		}else if ( month == 9 && days>=15 || 30 >= days ) {
			tot = choice *2/3;	
			tot = tot + choice %3;
			 total = tot * num1  ;
				return total;
				
		} else {
			total = choice *num1;
			return total;
		}
	
		

	}
	/**
	 * look for if step 15 to oct 14
	 * if it bettween those date it would apply the discount 
	 * @return total1
	 * else the code does normal 
	 */
	public double choice2() {
		System.out.print("the Number of units:");
		double tot = 1.0;
		double total1;
		int choice = keyboard.nextInt();
		if(month == 10 && days>=1 || 14 >= days) {
			tot = choice *2/3;	
			tot = tot + choice %3;
			 total1 = tot * num2  ;
				return total1;
			
		}else if ( month == 9 && days>=15 || 30 >= days ) {
			tot = choice *2/3;	
			tot = tot + choice %3;
			 total1 = tot * num2  ;
				return total1;
		} else {
			total1 = choice *num2;
			return total1;
		}
	
	
	}	

}
