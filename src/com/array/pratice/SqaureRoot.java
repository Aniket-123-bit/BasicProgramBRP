package com.array.pratice;
import java.util.Scanner;
import java.lang.Math;

public class SqaureRoot {
	public static void main(String args []) {
		double x,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any +ve no:");
		x=sc.nextFloat();
		result=Math.sqrt(x);
		System.out.println("Square root of"+x+"is:"+result);
		
	}

}
