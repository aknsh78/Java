import java.util.Scanner;
class operators{
     public static void main(String[] args) {
          System.out.println("Enter first number:");
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          System.out.println("Enter second number:"); 
          int b=sc.nextInt();
          System.out.println("Select the operation you want to perform:");
          int choice=sc.nextInt();
          switch(choice){
               case 1:
                    int sum=a+b;
                    System.out.println("Sum of two number is:"+sum);
                    break;
               case 2:
                    int diff=a-b;
                    System.out.println("Difference of two number is:"+diff);
                    break;
               case 3:
                    int product=a*b;
                    System.out.println("Product of two number is:"+product);
                    break;
               case 4
                    int div=a/b;
                    System.out.println("Division of two number is:"+div);
                    break;
              
               default:
                    System.out.println("Invalid Choice");
                    return;
          }
          System.out.println("Thank you for using the calculator!");
     }
}
