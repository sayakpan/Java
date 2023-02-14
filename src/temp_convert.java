// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

import java.util.Scanner;

public class temp_convert {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        float temp;
        char scale;
        System.out.print("Enter Temperature to Convert : ");
        temp = sc.nextFloat();
        System.out.print("Enter Scale (C/F) : ");
        scale = sc.next().charAt(0);
        switch (scale) {
            case 'c':
            case 'C':
                System.out.println("Entered Temperature : " + temp + " C");
                System.out.println("Converted Temperature : " + ((9 * temp / 5) + 32) + " F");
                break;
            case 'f':
            case 'F':
                System.out.println("Entered Temperature : " + temp + " F");
                System.out.println("Converted Temperature : " + ((temp - 32) * 5 / 9) + " C");
                break;
            default:
                System.out.println("Please Choose Scale Between C and F");
                break;
        }
    }
}
