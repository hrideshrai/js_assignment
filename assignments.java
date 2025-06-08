public class assignments {

//1. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car with method display() method to print details of the Car.

    static class Vehicle1 {
        void drive() {
            System.out.println("Vehicle is driving.");
        }
    }

    static class Car1 extends Vehicle1 {
        void display() {
            System.out.println("This is a Car. Brand: Tesla, Model: Model S");
        }
    }

//2. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method.

    static class Employee {
        void work() {
            System.out.println("Employee is working...");
        }

        double getSalary() {
            return 50000.00;
        }
    }

    static class HRManager extends Employee {
        @Override
        void work() {
            System.out.println("HR Manager is hiring new employees.");
        }
    }

//3. Imagine that you are building a geometry calculator program. You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles. To achieve this, you decide to use a multilevel inheritance hierarchy.

    static class Shape {
        int length, breadth, radius;

        Shape(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        Shape(int radius) {
            this.radius = radius;
        }
    }

    static class Rectangle extends Shape {
        Rectangle(int length, int breadth) {
            super(length, breadth);
        }

        void calculateArea() {
            int area = length * breadth;
            System.out.println("Rectangle Area: " + area);
        }
    }

    static class Circle extends Shape {
        Circle(int radius) {
            super(radius);
        }

        void calculateArea() {
            double area = Math.PI * radius * radius;
            System.out.println("Circle Area: " + area);
        }
    }


//4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.
    static class Vehicle2 {
        void startEngine() {
            System.out.println("Engine started.");
        }

        void stopEngine() {
            System.out.println("Engine stopped.");
        }
    }

    static class Car2 extends Vehicle2 {
        void drive() {
            System.out.println("Car is driving.");
        }
    }

    static class Motorcycle extends Vehicle2 {
        void ride() {
            System.out.println("Motorcycle is riding.");
        }
    }


//5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.
    static class Shape2 {
        double calculateArea() {
            return 0.0;
        }
    }

    static class Rectangle2 extends Shape2 {
        int length, breadth;

        Rectangle2(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        double calculateArea() {
            return length * breadth;
        }

        double calculatePerimeter() {
            return 2 * (length + breadth);
        }
    }

    static class Circle2 extends Shape2 {
        int radius;

        Circle2(int radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }

        double calculateCircumference() {
            return 2 * Math.PI * radius;
        }
    }


//6. Let's examine the Java program given. It involves multiple classes that depict different book types, including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and a method called displayDetails(). This method is responsible for outputting the title and author of a book. The remaining classes inherit both the constructor and methods of the Book class as they extend it.
    static class Book {
        String title, author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    static class FictionBook extends Book {
        FictionBook(String title, String author) {
            super(title, author);
        }
    }

    static class NonFictionBook extends Book {
        NonFictionBook(String title, String author) {
            super(title, author);
        }
    }

    static class TechnicalBook extends Book {
        TechnicalBook(String title, String author) {
            super(title, author);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        System.out.println("1. Vehicle and Car:");
        Car1 car1 = new Car1();
        car1.drive();
        car1.display();

        System.out.println("\n2. Employee and HRManager:");
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());

        System.out.println("\n3. Geometry Calculator:");
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.calculateArea();
        Circle circle = new Circle(7);
        circle.calculateArea();

        System.out.println("\n4. Vehicle Hierarchy:");
        Car2 car2 = new Car2();
        car2.startEngine();
        car2.drive();
        car2.stopEngine();
        Motorcycle bike = new Motorcycle();
        bike.startEngine();
        bike.ride();
        bike.stopEngine();

        System.out.println("\n5. Shape Hierarchy:");
        Rectangle2 rect2 = new Rectangle2(8, 4);
        System.out.println("Rectangle Area: " + rect2.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect2.calculatePerimeter());
        Circle2 circle2 = new Circle2(6);
        System.out.println("Circle Area: " + circle2.calculateArea());
        System.out.println("Circle Circumference: " + circle2.calculateCircumference());

        System.out.println("\n6. Book Hierarchy:");
        FictionBook fb = new FictionBook("1984", "George Orwell");
        NonFictionBook nfb = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook tb = new TechnicalBook("Java Programming", "Herbert Schildt");

        fb.displayDetails();
        System.out.println();
        nfb.displayDetails();
        System.out.println();
        tb.displayDetails();
    }
}
