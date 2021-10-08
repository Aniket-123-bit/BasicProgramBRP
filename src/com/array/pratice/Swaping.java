package com.array.pratice;
//2 variable
import java.util.*;

public class Swaping {
	public static void main(String args []) {
		float a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Values before swapping:");
		System.out.println("Enter first variable:");
		a=in.nextFloat();
		System.out.println("Enter second variable:");
		b=in.nextFloat();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values after swapping:");
		System.out.println("First var:" +a+"\t"+"second var.:"+b);
	}

}
