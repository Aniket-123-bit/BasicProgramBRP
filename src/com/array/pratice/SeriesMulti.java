package com.array.pratice;
import java.util.Scanner;

public class SeriesMulti {
	public static void main(String args[]) {
		int m=1,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n:");
		n=in.nextInt();
		System.out.println("Series is:");
		while(n>1) {
			System.out.println(n+"*");
			m=n*n;
			n--;
			
		}
		System.out.println("="+m);
		
	}
	

}
