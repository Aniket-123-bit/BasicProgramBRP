package com.array.pratice;
import java.util.Scanner;


public class SwapNumber {
	public static void main(String args)
	{
		float a,b;
		float temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Value before swapping:");
		System.out.println("Enter  First Variable:");
		a=sc.nextFloat();
		System.out.println("Enter second variable:");
		b=sc.nextFloat();
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values after Swapping:");
		System.out.println("First var.:"+a+"\t"+"Second var.:"+b);
		
	}
}
