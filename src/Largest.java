// Name - Sayak Pan
// Roll No - 4
// Java Assignment 3 - Flow Control

import java.util.Scanner;
import java.lang.Math;

public class Largest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");
        int counter = 0, number, largest = Integer.MIN_VALUE;
        int elements[] = new int[10];
        char choice;
        do {
            System.out.print("Enter Sales Figure of an Employee : ");
            number = sc.nextInt();
            elements[counter] = number;
            largest = Find_largest(elements, largest);
            System.out.println("Largest Value Till Now : " + largest);
            System.out.println("Do you want to Add More (Y for Yes/N for No): ");
            choice = sc.next().toUpperCase().charAt(0);
            if (counter >= 9) {
                System.out.println("10 Values Entered Already");
                break;
            }
        } while (choice != 'N');

        System.out.println("Largest Sales Figure Overall: " + largest);

    }

    public static int Find_largest(int[] arr, int larger) {
        for (int i = 0; i < arr.length; i++) {
            larger = Math.max(larger, arr[i]);
        }
        return larger;
    }
}
