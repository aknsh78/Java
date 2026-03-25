import java.util.Scanner;

class Shape {
    void area() {
        System.out.println("Area not defined");
    }
}

class Circle extends Shape {
    double radius;

    Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class TestShapes {
    public static void main(String[] args) {
        System.out.println("Name: Esha Sarswat Roll No: 2400320100457");

        Shape s;

        s = new Circle(); 
        s.area();

        s = new Rectangle();
        s.area();
    }
}
