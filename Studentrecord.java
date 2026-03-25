import java.util.Scanner;

class Person {
    String name;
    int age;

    void getPersonDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
    }
}

class Student extends Person {
    int rollNo;
    String course;

    void getStudentDetails(Scanner sc) {
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Studentrecord {
    public static void main(String[] args) {
        System.out.println("Name: Esha Sarswat Roll No:2400320100457");
        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.getPersonDetails(sc);
        s.getStudentDetails(sc);
        s.display();

        sc.close();
    }
}
