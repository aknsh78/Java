import Mathematics.Matrix;

public class Exp16_PackageUse {
    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        Matrix m = new Matrix();

        int[][] add = m.add(a, b);
        int[][] sub = m.sub(a, b);

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}
