public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;

            int result = a / b; 
            System.out.println("Result: " + result);

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]); 

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught: " + e);

        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);

        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}