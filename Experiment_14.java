import java.util.Scanner;

public class Experiment_14 {
    
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        try {
            checkAge(userAge);
        } catch (Exception e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
        
        sc.close();
    }
}
