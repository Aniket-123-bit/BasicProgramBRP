package com.array.pratice;

public class ArrayTest {
	public static void main(String[] args) {
		//create int array.
		int[] array = new int[5];
		
		//assign elements
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		//loop over elements.
		for(int i = 0; i<array.length; i++) {
			//get value
			int value = array[i];
			//print value
			System.out.println("int value:"+ value);
			
		}
	}

}
