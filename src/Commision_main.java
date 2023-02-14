// Name - Sayak Pan
// Roll No - 4
// Java Assignment 2 - Class and Constructors

import java.util.Scanner;

class Commission {
    int sales;

    Commission(int sales) {
        this.sales = sales;
    }

    float commission() {
        return sales * 25 / 100;
    }
}

public class Commision_main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        int sales;
        System.out.println("Enter SALES Number : ");
        sales = sc.nextInt();
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission cm = new Commission(sales);
            System.out.println("Sales : " + cm.sales + "\nCommission : " + cm.commission());
        }
    }
}