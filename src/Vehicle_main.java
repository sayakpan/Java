// Name - Sayak Pan
// Roll No - 4
// Java Assignment 4 - Inheritance and Dynamic Polymorphism

class Vehicle {
    int numWheels;
    double speed;

    Vehicle(int numWheels, double speed) {
        this.numWheels = numWheels;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    int numPassengers;

    Car(int numWheels, double speed, int numPassengers) {
        super(numWheels, speed);
        this.numPassengers = numPassengers;
    }
}

class Truck extends Vehicle {
    double loadLimit;

    Truck(int numWheels, double speed, double loadLimit) {
        super(numWheels, speed);
        this.loadLimit = loadLimit;
    }
}

public class Vehicle_main {
    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 4\n\n");

        Car car = new Car(4, 100.0, 4);
        Truck truck = new Truck(6, 80.0, 10000.0);

        System.out.println("CAR DETAILS");
        System.out.println("Number of wheels: " + car.numWheels);
        System.out.println("Speed: " + car.speed);
        System.out.println("Number of passengers: " + car.numPassengers);

        System.out.println("\nTRUCK DETAILS");
        System.out.println("Number of wheels: " + truck.numWheels);
        System.out.println("Speed: " + truck.speed);
        System.out.println("Load limit: " + truck.loadLimit);

        if (car.speed > truck.speed) {
            System.out.println("\nCAR is faster than TRUCK");
        } else if (truck.speed > car.speed) {
            System.out.println("\nTRUCK is faster than CAR");
        } else {
            System.out.println("\nCAR and TRUCK have the same speed");
        }
    }
}
