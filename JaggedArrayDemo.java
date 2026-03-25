
//Write a program in java which creates the variable size array (Jagged Array) and print all the values using loop statement.
import java.util.Scanner;

public class JaggedArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Declare jagged array
        int[][] arr = new int[rows][];

        // Input values
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();

            arr[i] = new int[cols]; 

            System.out.println("Enter elements of row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing jagged array
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
