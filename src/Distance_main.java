// Name - Sayak Pan
// Roll No - 4
// Java Assignment 4 - Inheritance and Dynamic Polymorphism

class Distance {
    double distance;

    Distance(double distance) {
        this.distance = distance;
    }

    void travelTime() {
        double time = distance / 60.0;
        System.out.println("Time taken to cover the distance at 60 miles per hour: " + time + " hours");
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double distance) {
        super(distance);
    }

    void travelTime() {
        double time = distance / 100.0;
        System.out.println("Time taken to cover the distance at 100 km per second: " + time + " seconds");
    }
}

public class Distance_main {
    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 4\n\n");

        Distance distanceInMiles = new Distance(120.0);
        distanceInMiles.travelTime();

        DistanceMKS distanceInKilometers = new DistanceMKS(200.0);
        distanceInKilometers.travelTime();
    }
}
