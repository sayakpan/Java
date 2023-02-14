// Name - Sayak Pan
// Roll No - 4
// Java Assignment 1

public class rev_cmd {
    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        StringBuilder sb = new StringBuilder(args[0]);
        sb.reverse();
        System.out.println("Reversed : " + sb.toString());
    }
}