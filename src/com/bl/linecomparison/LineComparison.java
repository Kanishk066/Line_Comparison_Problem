package com.bl.linecomparison;
import java.util.Scanner;
class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class Line {
    Point startPoint;
    Point endPoint;
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public double getLength() {
        double length = Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));
        return length;
    }
    public boolean isEqual(Line line) {
        return(this.startPoint.x == line.startPoint.x && this.startPoint.y == line.startPoint.y && this.endPoint.x == line.endPoint.x && this.endPoint.y == line.endPoint.y);
    }
    public int compareTo(Line line) {
        Double length1 = this.getLength();
        Double length2 = line.getLength();
        return length1.compareTo(length2);
    }
}
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);


        // Create two lines with different endpoints
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();
        Point startPoint1 = new Point(x1,y1);
        Point endPoint1 = new Point(x2,y2);
        Line line1 = new Line(startPoint1,endPoint1);

        System.out.println("Enter the value of x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Enter the value of y3: ");
        double y3 = sc.nextDouble();
        System.out.println("Enter the value of x4: ");
        double x4 = sc.nextDouble();
        System.out.println("Enter the value of y4: ");
        double y4 = sc.nextDouble();
        Point startPoint2 = new Point(x3,y3);
        Point endPoint2 = new Point(x4,y4);
        Line line2 = new Line(startPoint2,endPoint2);
        System.out.println("The length of Line 1 is "+ line1.getLength() );
        System.out.println("The length of Line 2 is "+ line2.getLength() );

        // Check if the two lines are equal
        if (line1.isEqual(line2)) {
            System.out.println("line1 and line2 are equal");
        } else {
            System.out.println("line1 and line2 are not equal");
        }

        // Compare the two lines using the compareTo method
        int compareResult = line1.compareTo(line2);
        if (compareResult == 0) {
            System.out.println("line1 and line2 are of equal length");
        } else if (compareResult < 0) {
            System.out.println("line1 is shorter than line2");
        } else {
            System.out.println("line1 is longer than line2");
        }
    }
}
