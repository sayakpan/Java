// Name - Sayak Pan
// Roll No - 4
// Java Assignment 3 - Flow Control

import java.util.Scanner;

public class calculate_e {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");
        int n;
        double e = 0.0;
        System.out.println("Enter Value of N : ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            e += 1.00 / fact(i);
            System.out.print("1/" + i + "! + ");
        }
        System.out.print("= " + e);
    }

    public static int fact(int num) {
        if (num == 0)
            return 1;
        else {
            return num * fact(num - 1);

        }
    }
}