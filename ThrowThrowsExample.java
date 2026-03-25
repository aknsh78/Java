import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowThrowsExample {

    // using throws
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // using throw
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age. You can vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}