package practiceProblem_Weak01.Thrusday_06_feb_2025.Level_03;

import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        int rows = 3, columns = 3;
        int[][] matrixA = createRandomMatrix(rows, columns);
        int[][] matrixB = createRandomMatrix(rows, columns);

        int[][] sum = addMatrices(matrixA, matrixB);
        int[][] diff = subtractMatrices(matrixA, matrixB);
        int[][] product = multiplyMatrices(matrixA, matrixB);
        int[][] transpose = transposeMatrix(matrixA);
        int determinantA = determinant2x2(matrixA);
        int determinantB = determinant3x3(matrixB);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        System.out.println("Sum of Matrices:");
        displayMatrix(sum);
        System.out.println("Difference of Matrices:");
        displayMatrix(diff);
        System.out.println("Product of Matrices:");
        displayMatrix(product);
        System.out.println("Transpose of Matrix A:");
        displayMatrix(transpose);
        System.out.println("Determinant of Matrix A (2x2): " + determinantA);
        System.out.println("Determinant of Matrix B (3x3): " + determinantB);
    }

    public static int[][] createRandomMatrix(int rows, int columns) {
        Random rand = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] sum = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] diff = new int[matrixA.length][matrixA[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                diff[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return diff;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] product = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return product;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}

