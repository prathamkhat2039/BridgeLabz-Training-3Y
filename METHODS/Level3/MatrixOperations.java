import java.util.*;

public class MatrixOperations {
    
    // Method to create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(10); // 0–9
            }
        }
        return mat;
    }

    public static int[][] add(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = A[i][j] + B[i][j];
        return res;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int r = A.length, c = A[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = A[i][j] - B[i][j];
        return res;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length, c2 = B[0].length;
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println("A + B:");
        printMatrix(add(A, B));
        System.out.println("A - B:");
        printMatrix(subtract(A, B));
        System.out.println("A * B:");
        printMatrix(multiply(A, B));
    }
}
