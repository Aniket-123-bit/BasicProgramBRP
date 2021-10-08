package com.array.pratice;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		int p;
		float r,t,si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal:");
		p=sc.nextInt();
		System.out.println("Enter time in months:");
		t=sc.nextFloat();
		System.out.println("Enter rate:");
		r=sc.nextFloat();
		si=(p*r*t)/100;
		System.out.println("Simple interest:"+si);
		
	}

}
