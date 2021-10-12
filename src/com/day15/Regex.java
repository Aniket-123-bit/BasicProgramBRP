package com.day15;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	 public static void main(String[] args ){
	        // Declare the object and initialize with
	        // predefined standard input object

	        Scanner sc = new Scanner(System.in);
	           //Regex Pattern
	            String regex = "^[A-Z]{1}[a-z]{2}$";

	            System.out.println("Enter your name");
	            // String input
	            String name = sc.next();

	           // compile the regex to create pattern
	          // using compile() method
	        Pattern pattern = Pattern.compile(regex);

	        // get a matcher object from pattern
	            Matcher matcher = pattern.matcher(name);
	            if(matcher.matches()){
	                System.out.println("Given name id is valid");
	            }else{
	                System.out.println("Given name id is not valid");
	            }
	        }

	

}
