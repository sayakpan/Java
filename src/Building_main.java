// Name - Sayak Pan
// Roll No - 4
// Java Assignment 4 - Inheritance and Dynamic Polymorphism

class Building {
    int floors;
    int no_of_rooms;
    double footage;

    Building(int floors, int no_of_rooms, double footage) {
        this.floors = floors;
        this.no_of_rooms = no_of_rooms;
        this.footage = footage;
    }
}

class House extends Building {
    int no_of_bedrooms;
    int no_of_bathrooms;

    House(int floors, int no_of_rooms, double footage, int no_of_bedrooms, int no_of_bathrooms) {
        super(floors, no_of_rooms, footage);
        this.no_of_bedrooms = no_of_bedrooms;
        this.no_of_bathrooms = no_of_bathrooms;
    }
}

class Office extends Building {
    int no_of_telephone;
    int no_of_table;

    Office(int floors, int no_of_rooms, double footage, int no_of_telephone, int no_of_table) {
        super(floors, no_of_rooms, footage);
        this.no_of_telephone = no_of_telephone;
        this.no_of_table = no_of_table;
    }
}

public class Building_main {
    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 4\n\n");

        Building bd = new Building(10, 50, 600.5);
        House hs = new House(12, 150, 800.526, 25, 80);
        System.out.println("Building\n\nNo of Floors - " + bd.floors + "\nNo of Rooms - " + bd.no_of_rooms
                + "\nTotal Footage - " + bd.footage + "\n\n");
        System.out.println("House\n\nNo of Floors - " + hs.floors + "\nNo of Rooms - " + hs.no_of_rooms
                + "\nTotal Footage - " + hs.footage + "\nNo of Bedrooms - " + hs.no_of_bedrooms + "\nNo of Bathrooms"
                + hs.no_of_bathrooms + "\n\n");
        Office of = new Office(15, 200, 700.526, 20, 30);
        System.out.println("Office\n\nNo of Floors - " + of.floors + "\nNo of Rooms - " + of.no_of_rooms
                + "\nTotal Footage - " + of.footage + "\nNo of Telephone - " + of.no_of_telephone + "\nNo of Table - "
                + of.no_of_table + "\n\n");
    }
}