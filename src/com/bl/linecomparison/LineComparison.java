package com.bl.linecomparison;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

//        UC-1

        // Create two lines with different endpoints
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();
        System.out.println("Enter the value of x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextDouble();
        System.out.println("Enter the value of x4: ");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value of y4: ");
        double y4 = sc.nextDouble();
        // Calculate the length of each line
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        // Print the length of each line to the console
        System.out.println("The length of line1 is " + length1);
        System.out.println("The length of line2 is " + length2);

//       UC-2

        // Check if the two lines are equal
        boolean equal = (x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4);
        if (equal) {
            System.out.println("line1 and line2 are equal");
        } else {
            System.out.println("line1 and line2 are not equal");
        }

//      UC-3

        // Compare the two lines using the compareTo method
        int compareResult = Double.compare(length1, length2);
        if (compareResult == 0) {
            System.out.println("line1 and line2 are of equal length");
        } else if (compareResult < 0) {
            System.out.println("line1 is shorter than line2");
        } else {
            System.out.println("line1 is longer than line2");
        }
    }
}
