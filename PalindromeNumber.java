//Checking palindrom or not
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("The program is coded by Akansha Kukshal,2400320100117");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        //Checking palindrome
        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}

