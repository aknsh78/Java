
interface Sports {
    void playSports();
}

interface Academics {
    void study();
}

class Student implements Sports, Academics {

    String name;
    int rollNo;

    void getDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void playSports() {
        System.out.println(name + " plays football.");
    }

    public void study() {
        System.out.println(name + " studies Computer Science.");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) 

        Student s = new Student();
        s.getDetails("Mannu", 17);

        s.display();
        s.playSports();
        s.study();
    }
}
