import java.util.*;

class BankAccount {
    private double balance;

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if(amt > balance)
            System.out.println("Insufficient Balance");
        else
            balance -= amt;
    }

    void show() {
        System.out.println("Balance: " + balance);
    }
}

public class BankMenu {
    public static void main(String[] args) {

        System.out.println("Name: Akansha Kukshal Roll No: 240003201000117");

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        int ch;
        double amt;

        do {
            System.out.println("1.Deposit 2.Withdraw 3.Show 4.Exit");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    amt = sc.nextDouble();
                    b.deposit(amt);
                    break;
                case 2:
                    amt = sc.nextDouble();
                    b.withdraw(amt);
                    break;
                case 3:
                    b.show();
                    break;
            }
        } while(ch != 4);
    }
}
