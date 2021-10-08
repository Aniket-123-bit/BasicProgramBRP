package com.array.pratice;
import java.util.Scanner;
public class Even {
	public static void main(String args []) {
		int n,squre,cube;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any no:");
		n=in.nextInt();
		if(n%2==0) {
			System.out.println(n+"Even is no.");
			squre=n*n;
			System.out.println("square of"+n+"is:"+squre);
		}
		else {
			System.out.println(n+"is odd no.");
			cube=n*n*n;
			System.out.println("cube of"+n+"is:"+cube);
		}
	}

}
