// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

public class Divisable3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        for (int i = Integer.parseInt(args[0]); i <= Integer.parseInt(args[1]); i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }
    }
}