import java.util.Scanner;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

public class NegativeAmount {

    public static void main(String[] args) {
        System.out.println("Name : Akriti yadav Roll No: 2400320100128");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        try {

            if (amount < 0) {
                throw new NegativeAmountException("Negative amount not allowed!");
            }

            System.out.println("Amount accepted: " + amount);
        }

        catch (NegativeAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
