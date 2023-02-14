// Name - Sayak Pan
// Roll No - 4
// Java Assignment 2 - Class and Constructors

import java.util.Scanner;

class Grader {
    int score;

    Grader(int score) {
        this.score = score;
    }

    char lettergrade() {
        if (this.score >= 90)
            return 'O';
        else if (this.score >= 80 && this.score < 90)
            return 'E';
        else if (this.score >= 70 && this.score < 80)
            return 'A';
        else if (this.score >= 60 && this.score < 70)
            return 'B';
        else if (this.score >= 50 && this.score < 60)
            return 'C';
        else
            return 'F';
    }
}

public class Grader_main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        int score;
        System.out.println("Enter Score : ");
        score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
        } else {
            Grader gd = new Grader(score); // Object Created
            System.out.println("Score = " + gd.score + " Grade = " + gd.lettergrade());
        }
    }
}