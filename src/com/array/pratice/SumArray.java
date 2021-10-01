package com.array.pratice;

public class SumArray {
	public static void main(String[] args) {
		int[] array = {60, 70, 80, 90, 100};
		int largest;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Number"+ i +" = " +array[i]);
		}
		
		largest=array[0];
		for(int i=0; i<array.length; i++) 
		{
			if(largest<array[i]) 
			{
				largest=array[i];
			}
			System.out.println("Largest no is:" +largest);
		
		}
	}
	
}