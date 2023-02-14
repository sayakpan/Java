// Name - Sayak Pan
// Roll No - 4
// Java Assignment 2 - Class and Constructors

package Smart;

import java.util.Scanner;

import Phone.*;

class Smart_phone extends Telephone {
    boolean enabled_5G;
    boolean foldable;
    boolean dual_screen;

    Smart_phone(int mobile_id, String model_name, int available_quantity, boolean enabled_5G, boolean foldable,
            boolean dual_screen) {
        super(mobile_id, model_name, available_quantity);
        this.enabled_5G = enabled_5G;
        this.foldable = foldable;
        this.dual_screen = dual_screen;
    }

    void display() {
        System.out.println("\n\nDisplaying Info\n");

        System.out.println("Mobile ID : " + mobile_id);
        System.out.println("Model Name : " + model_name);
        System.out.println("Available Quantity : " + available_quantity);
        System.out.println("enabled_5G " + enabled_5G);
        System.out.println("foldable : " + foldable);
        System.out.println("dual_screen : " + dual_screen);
        System.out.println();
    }
}

public class Mobile_shop {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        int mobile_id, available_quantity;
        String model_name;
        boolean enabled_5G, foldable, dual_screen;

        System.out.print("Mobile ID : ");
        mobile_id = sc.nextInt();
        System.out.print("Model Name : ");
        model_name = sc.next();
        System.out.print("Available Quantity : ");
        available_quantity = sc.nextInt();
        System.out.print("enabled_5G ");
        enabled_5G = sc.nextBoolean();
        System.out.print("foldable : ");
        foldable = sc.nextBoolean();
        System.out.print("dual_screen : ");
        dual_screen = sc.nextBoolean();

        Smart_phone MI = new Smart_phone(mobile_id, model_name, available_quantity, enabled_5G, foldable, dual_screen);

        MI.display();

    }
}
