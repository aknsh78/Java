class Person {
    String name;
    int age;

    void getPersonDetails(String n, int a) {
        name = n;
        age = a;
    }
}

class Student extends Person {
    int rollNo;

    void getStudentDetails(int r) {
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getPersonDetails("Akriti yadav", 20);
        s.getStudentDetails(101);
        s.display();
    }
}
