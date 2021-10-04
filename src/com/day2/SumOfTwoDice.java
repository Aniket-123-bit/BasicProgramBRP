package com.day2;

public class SumOfTwoDice {
	 public static void main(String[] args) {
		    
	        int die1;   
	        int die2;   
	        int sum;   // The total roll (sum of the two dice).
	        
	        die1 = (int)(Math.random()*6) + 1;  // The number on the first die.
	        die2 = (int)(Math.random()*6) + 1;  // The number on the second die.
	        sum = die1 + die2;
	        
	        System.out.println("The first die value is " + die1);
	        System.out.println("The second die value is " + die2);
	        System.out.println("Sum Of Two Dice is " + sum);

	    }

}
