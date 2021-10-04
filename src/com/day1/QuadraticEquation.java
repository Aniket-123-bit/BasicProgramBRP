package com.day1;
import java.util.*;
public class QuadraticEquation {
	public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double delta = b * b - 4.0 * a * c;

            if (delta > 0.0) {
                double root1 = (-b + Math.pow(delta, 0.5)) / (2.0 * a);
                double root2 = (-b - Math.pow(delta, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + root1 + " and " + root2);
            } else if (delta == 0.0) {
                double root1 = -b / (2.0 * a);
                System.out.println("The root is " + root1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }

}
