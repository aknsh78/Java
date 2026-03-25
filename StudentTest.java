class Student {
    int id;
    String name;
    double marks;

    Student(int i, String n, double m) {
        id = i;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Akansha", 89.5);
        s1.display();
    }
}
