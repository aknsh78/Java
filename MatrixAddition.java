import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        System.out.println("Name: Akansha Kukshal Roll No: 240003201000117");

        Scanner sc = new Scanner(System.in);

        int rows = 2, cols = 2;
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
