package com.array.pratice;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String args []) {
		float a,b,big;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number a:");
		a=in.nextFloat();
		System.out.println("Enter the number b:");
		b=in.nextFloat();
		if(a>b) {
			big=a;
		}
		else {
			big=b;
		}
		System.out.println("Largest no is:"+big);
		
		
	}

}
