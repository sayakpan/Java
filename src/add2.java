// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

public class add2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");
        float num1, num2, sum;
        System.out.print("Enter Two Numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.print("The Sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
