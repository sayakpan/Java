import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Name - Sayak Pan
// Roll No - 4
// Java Assignment 2 - Class and Constructors

class Staff {
    int code;
    String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Code: " + code + "\nName: " + name;
    }
}

class Teacher extends Staff {
    String subject;
    String publication;

    Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() + "\nSubject: " + subject + "\nPublication: " + publication;
    }
}

class Officer extends Staff {
    String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Officer: " + super.toString() + "\nGrade: " + grade;
    }
}

class Typist extends Staff {
    int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Typist: " + super.toString() + "\nSpeed: " + speed;
    }
}

class RegularTypist extends Typist {
    int remuneration;

    public RegularTypist(int code, String name, int speed, int remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    @Override
    public String toString() {
        return "RegularTypist: " + super.toString() + "\nRemuneration: " + remuneration;
    }
}

class CasualTypist extends Typist {
    Float daily_wages;

    public CasualTypist(int code, String name, int speed, Float daily_wages) {
        super(code, name, speed);
        this.daily_wages = daily_wages;
    }

    @Override
    public String toString() {
        return "CasualType: " + super.toString() + "\nDaily Wages : " + daily_wages;
    }
}

public class Institute {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nName - Sayak Pan\nRoll No - 4\nJava Assignment 1\n\n");

        ArrayList<Staff> employees = new ArrayList<>();

        int option = 0, code, speed, remuneration;
        float daily_wages;
        String name, subject, grade, publication;
        do {
            System.out.println("\n\nEducational Institute\n\n");
            System.out.println("1. Add Staff");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Officer");
            System.out.println("4. Add Typist");
            System.out.println("5. Add Regular Typist");
            System.out.println("6. Add Casual Typist");
            System.out.println("7. Display Employee Information");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            try {
                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                input.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Enter code: ");
                    code = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    employees.add(new Staff(code, name));
                    break;
                case 2:
                    System.out.print("Enter code: ");
                    code = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter subject: ");
                    subject = input.next();
                    System.out.print("Enter publication: ");
                    publication = input.next();
                    employees.add(new Teacher(code, name, subject, publication));
                    break;
                case 3:
                    System.out.print("Enter code: ");
                    code = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter grade: ");
                    grade = input.next();
                    employees.add(new Officer(code, name, grade));
                    break;
                case 4:
                    System.out.print("Enter code: ");
                    code = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter speed: ");
                    speed = input.nextInt();
                    employees.add(new Typist(code, name, speed));
                    break;
                case 5:
                    System.out.print("Enter code: ");
                    code = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter speed: ");
                    speed = input.nextInt();
                    System.out.print("Enter remuneration: ");
                    remuneration = input.nextInt();
                    employees.add(new RegularTypist(code, name, speed, remuneration));
                    break;
                case 6:
                    System.out.print("Enter code: ");
                    code = input.nextInt();
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.print("Enter speed: ");
                    speed = input.nextInt();
                    System.out.print("Enter Daily Wages: ");
                    daily_wages = input.nextFloat();
                    employees.add(new CasualTypist(code, name, speed, daily_wages));
                    break;
                case 7:
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i).toString());
                        System.out.println();
                    }
                    break;
                case 8:
                    System.exit(0);
                case 0:
                default:
                    break;
            }
        } while (option != 0);
    }
}
