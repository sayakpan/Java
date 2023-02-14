// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

public class leap_yr {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        int year;
        System.out.print("Enter Year to Check Leap Year : ");
        year = sc.nextInt();
        if (year % 400 == 0)
            System.out.println("Year is Leap Year");
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println("Year is Leap Year");
        else
            System.out.println("Year is NOT Leap Year");
    }
}