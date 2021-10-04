package com.day7;
import java.util.Scanner;


public class SecondSmallest {
	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);

	    //Input size of an array
	    System.out.println("Enter the size of an array");
	    int n = in.nextInt();

	    //Array declaration
	    int arr[] = new int[n];

	    System.out.println("Enter the array elements");

	    //Taking an input value of an array
	    for (int j = 0; j < arr.length; j++) {
	       arr[j] = in.nextInt();
	    }
	    
	    //to find second smallest	
	    //Initialize with max value of integer
	    int smallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;

	    //Traverse an array
	    for (int i = 0; i < arr.length; i++) {

	      if (smallest > arr[i]) {
	         secondSmallest = smallest;
	         smallest = arr[i];

	     }

	     if (arr[i] > smallest && arr[i] < secondSmallest) {
	        secondSmallest = arr[i];
	     }
	   }
		//to find second largest	
	    //Initialize with min value of integer
	    int largest = Integer.MIN_VALUE;
	    int secondlargest = Integer.MIN_VALUE;

	    //Traverse an array
	    for (int i = 0; i < arr.length; i++) {

	      if (largest < arr[i]) {
	         secondlargest = largest;
	         largest = arr[i];

	     }

	     if (arr[i] < largest && arr[i] > secondlargest) {
	        secondlargest = arr[i];
	     }
	   }
	   System.out.println("Second largest number is " + secondlargest);
	   System.out.println("Second smallest number is " + secondSmallest);
	 }


}
