public class Student {
    int rollNo;        
    String name;       

    void display() {
        System.out.println(rollNo + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        

        s1.display();
    }
}
