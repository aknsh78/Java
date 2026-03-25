import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {

        System.out.println("The program is coded by Akansha Kukshal,2400320100117");

        
          System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        if (n <= 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}