// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

public class countDigits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        int num, count;
        System.out.print("Enter Number to Count Digits : ");
        num = sc.nextInt();
        String num_s = Integer.toString(num);
        count = num_s.length();
        System.out.println("Number of Digits : " + count);
    }
}
