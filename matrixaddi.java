import java.util.Scanner;
public class matrixaddi {
    public static void main(String[] args)
    {
        System.out.println("The program is coded by Akansha Kukshal,2400320100117");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of row");
        int r=sc.nextInt();
        System.out.println("Enter number of columns");
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        int[][]b=new int[r][c];
        int [][]sum= new int[r][c];
        System.out.println("Enter first matrix elemenet:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter second matrix elemenet:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the addition of matrix 1 and matrix 2 is :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");;
            }
        }
        System.out.println( );


    } 
    
}
