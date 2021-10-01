package com.array.pratice;
import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		n=in.nextInt();
		int[] array = new int[n];
		System.out.println("Enter element for arrays:");
		for(int i=0; i<array.length; i++) {
			array[i]=in.nextInt();
		}
		
		int smallest=array[0];
		for(int i =0; i<array.length; i++) {
			if(smallest>array[i]) {
				smallest=array[i];
			}
			System.out.println("Smallest no is :"+smallest);
		}
	}

}
