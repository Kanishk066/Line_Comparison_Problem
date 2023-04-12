package com.bl.linecomparison;
import java.lang.Math;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

//        UC-1

        // Create two lines with different endpoints
        double x1 = 1.0, y1 = 2.0;
        double x2 = 4.0, y2 = 6.0;
        double x3 = 3.0, y3 = 4.0;
        double x4 = 5.0, y4 = 7.0;
        // Calculate the length of each line
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        // Print the length of each line to the console
        System.out.println("The length of line1 is " + length1);
        System.out.println("The length of line2 is " + length2);
        // Check if the two lines are equal
        boolean equal = (x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4);
        if (equal) {
            System.out.println("line1 and line2 are equal");
        } else {
            System.out.println("line1 and line2 are not equal");
        }
    }
}
