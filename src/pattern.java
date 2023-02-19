// Name - Sayak Pan
// Roll No - 4
// Java Assignment 3 - Flow Control

import java.util.Scanner;

public class pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");
        int sideSize;
        System.out.print("Enter a Number to Print Pattern : ");
        sideSize = sc.nextInt();
        for (int i = 1; i <= sideSize; i++) {
            for (int j = 1; j <= sideSize; j++) {
                if (i == 1 || i == sideSize) {
                    System.out.print("*");
                } else if (j == 1 || j == sideSize) {
                    if (i % 2 == 0)
                        System.out.print("\\");
                    else
                        System.out.print("/");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}