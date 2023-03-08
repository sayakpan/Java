// Name - Sayak Pan
// Roll No - 4
// Java Assignment 4 - Inheritance and Dynamic Polymorphism

class ThreeDObject {
    int height;
    int width;
    int length;
    int radius;

    ThreeDObject(int height, int width, int length, int radius) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.radius = radius;
    }

    public void surfaceArea() {
        System.out.println("ThreeDObject : Parent");
    }

    public void volume() {
        System.out.println("ThreeDObject : Parent");
    }
}

class Box extends ThreeDObject {
    Box(int height, int width, int length) {
        super(height, width, length, 0);
    }

    @Override
    public void surfaceArea() {
        float s_area = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.println("Surface Area of Box : " + s_area);
    }

    @Override
    public void volume() {
        float vol = length * width * height;
        System.out.println("Volume of Box : " + vol);
    }
}

class Cube extends ThreeDObject {
    Cube(int side) {
        super(side, side, side, 0);
    }

    @Override
    public void surfaceArea() {
        float s_area = 6 * length * length;
        System.out.println("Surface Area of Cube : " + s_area);
    }

    @Override
    public void volume() {
        float vol = length * width * height;
        System.out.println("Volume of Cube : " + vol);
    }
}

class Cylinder extends ThreeDObject {
    Cylinder(int height, int radius) {
        super(height, 0, 0, radius);
    }

    @Override
    public void surfaceArea() {
        double s_area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
        System.out.println("Surface Area of Cylinder :" + s_area);
    }

    @Override
    public void volume() {
        double vol = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder : " + vol);
    }
}

class Cone extends ThreeDObject {
    Cone(int height, int radius) {
        super(height, 0, 0, radius);
    }

    @Override
    public void surfaceArea() {
        double s_area = Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
        System.out.println("Surface Area of Cone :" + s_area);
    }

    @Override
    public void volume() {
        double vol = Math.PI * Math.pow(radius, 2) * height / 3;
        System.out.println("Volume of Cone : " + vol);
    }
}

public class ThreeDObjects_Main {
    public static void main(String[] args) {
        System.out.print("Name - Sayak Pan\nRoll No - 4\nJava Assignment 4\n\n");

        ThreeDObject t1 = new ThreeDObject(10, 20, 30, 40);
        Box b1 = new Box(10, 20, 30);
        Cube c1 = new Cube(5);
        Cylinder cy1 = new Cylinder(5, 6);
        Cone cn1 = new Cone(7, 8);

        t1.surfaceArea();
        t1.volume();
        b1.surfaceArea();
        b1.volume();
        c1.surfaceArea();
        c1.volume();
        cy1.surfaceArea();
        cy1.volume();
        cn1.surfaceArea();
        cn1.volume();
    }
}
