import java.io.Console;

class User {
    String username;
    char[] password;

    void readDetails() {
        Console con = System.console();

        if (con == null) {
            System.out.println("Console not available. Please run in terminal.");
            return;
        }

        username = con.readLine("Enter Username: ");
        password = con.readPassword("Enter Password: ");
    

    void displayDetails() {
        System.out.println("\nEntered Username: " + username);
        System.out.println("Entered Password: " + new String(password));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Akanshha Kukshal Roll No:2400320100117");

        User u = new User();
        u.readDetails();
        u.displayDetails();
    }
}