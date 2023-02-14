// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

public class max {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        int num1, num2, num3;
        System.out.print("Enter Three Numbers to Find Maxmum : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println("Maximum : " + Math.max(num1, Math.max(num2, num3)));
    }
}
