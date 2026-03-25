import java.util.Scanner;

class Demo {

   
    static void checkMobile(String mobile) throws Exception {
        if (mobile.length() != 10) {
       
            throw new Exception("Invalid Mobile Number");
        } else {
            System.out.println("Valid Mobile Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        try {
            checkMobile(mobile);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Akansha Kukshal")

        sc.close();
    }
}