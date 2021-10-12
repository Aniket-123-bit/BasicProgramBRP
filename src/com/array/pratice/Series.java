package com.array.pratice;
import java.util.*;


public class Series {
	public static void main(String args[]) {
		int i=1,s=0,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of terms:");
		n=in.nextInt();
		System.out.println("Series is:");
		while(i<=n) {
			s=s+i;
			System.out.println(i+"+");
			i++;
		}
		System.out.println("="+s);
		
	}

}
