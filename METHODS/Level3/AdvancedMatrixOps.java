import java.util.*;

public class AdvancedMatrixOps {

    public static int[][] transpose(int[][] A) {
        int r = A.length, c = A[0].length;
        int[][] T = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                T[j][i] = A[i][j];
        return T;
    }

    // Determinant of 2x2
    public static int determinant2x2(int[][] A) {
        return (A[0][0]*A[1][1]) - (A[0][1]*A[1][0]);
    }

    // Determinant of 3x3
    public static int determinant3x3(int[][] A) {
        return A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1])
             - A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0])
             + A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / (double)det;
        inv[0][1] = -A[0][1] / (double)det;
        inv[1][0] = -A[1][0] / (double)det;
        inv[1][1] = A[0][0] / (double)det;
        return inv;
    }

    // Print matrix
    public static void printMatrix(double[][] A) {
        for (double[] row : A) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void printMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {{4,7},{2,6}};
        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Transpose:");
        printMatrix(transpose(A));

        System.out.println("Determinant (2x2): " + determinant2x2(A));

        System.out.println("Inverse (2x2):");
        printMatrix(inverse2x2(A));
    }
}
