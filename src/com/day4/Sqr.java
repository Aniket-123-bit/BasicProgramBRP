package com.day4;
import java.util.Scanner;  

public class Sqr {
	

		public static void main(String[] args)    
		{   
			System.out.print("Enter a number: ");  
			Scanner sc = new Scanner(System.in);    
			int c = sc.nextInt();
			System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
		}  

		public static double squareRoot(int num)   
		{    
			double t;  
			double sqrtroot=num/2;  
			do   
			{  
				t=sqrtroot;  
				sqrtroot=(t+(num/t))/2;  
			}   
			while((t-sqrtroot)!= 0);  
			return sqrtroot;  
		}  

}
