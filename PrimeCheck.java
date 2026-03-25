public class PrimeCheck {
    public static void main(String[] args) {

        System.out.println("Name: Akansha Kukshal Roll No: 240003201000117");

        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        } else {
            for(int i=2;i<=num/2;i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}

