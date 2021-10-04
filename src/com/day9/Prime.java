package com.day9;
import java.math.RoundingMode; 
import com.google.common.math.IntMath; 

public class Prime {
	 // Driver code 
    public static void main(String args[]) 
    { 
        int a1 = 63;
          
        // Using isPrime(int n) 
        // method of Guava's IntMath class
        if(IntMath.isPrime(a1))
        System.out.println(a1 + " is a prime number");
        else
        System.out.println(a1 + " is not a prime number");
          
        int a2 = 17;
          
        // Using isPrime(int n) 
        // method of Guava's IntMath class
        if(IntMath.isPrime(a2))
        System.out.println(a2 + " is a prime number");
        else
        System.out.println(a2 + " is not a prime number");
    } 

}
