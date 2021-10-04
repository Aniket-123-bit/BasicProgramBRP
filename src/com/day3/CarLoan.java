package com.day3;
import java.util.Scanner;

public class CarLoan {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double P, Y, R, payment, n, r;

		System.out.println("Enter the principal amount: ");
		P = sc.nextFloat();
		System.out.println("Enter the total no of Years: ");
		Y = sc.nextFloat();
		System.out.println("Enter the compound interest Percent: ");
		R = sc.nextFloat();
	
		n = 12 * Y;
		r = R / (12 * 100);

		payment = (P*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
		
		System.out.println("Payment is: " + payment);
}

}
