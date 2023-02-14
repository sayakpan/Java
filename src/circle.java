// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

class circle_class {
    double r;

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}

public class circle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");
        circle_class circle1 = new circle_class();
        System.out.println("Enter Radius : ");
        circle1.r = sc.nextDouble();
        System.out.println("Perimeter = " + circle1.getPerimeter());
        System.out.println("Area = " + circle1.getArea());
    }
}
