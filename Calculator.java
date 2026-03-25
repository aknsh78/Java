import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Name: Akriti yadav  Roll No:2400320100128");
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of integers: " + obj.add(x, y));

        System.out.print("Enter two floating numbers: ");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        System.out.println("Sum of floats: " + obj.add(f1, f2));


        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("sum of three numbers are :-\n");
        System.out.println( obj.add(a, b, c));

        sc.close();
    }
}
