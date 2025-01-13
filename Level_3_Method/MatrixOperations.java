
// Importing java utilpackage for all the classes
import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrixA = generateRandomMatrix(3, 3);
        int[][] matrixB = generateRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Matrix Addition:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Matrix Subtraction:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Matrix Multiplication:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));

        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("Determinant of 3x3 Matrix A: " + determinant3x3(matrixA));

        System.out.println("Inverse of 2x2 Submatrix of A:");
        double[][] inverse2x2 = inverse2x2(new int[][]{{matrixA[0][0], matrixA[0][1]}, {matrixA[1][0], matrixA[1][1]}});
        displayMatrix(inverse2x2);

        System.out.println("Inverse of Matrix A (3x3):");
        double[][] inverse3x3 = inverse3x3(matrixA);
        if (inverse3x3 != null) {
            displayMatrix(inverse3x3);
        } else {
            System.out.println("Matrix A is not invertible.");
        }
    }

    // Implementing a method to generate a random matrix
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random integers between 0 and 9
            }
        }
        return matrix;
    }

    // Implementing a method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Implementing a method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Implementing a method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Implementing a method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Implementing a method to calculate the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Implementing a method to calculate the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Implementing a method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;

        return inverse;
    }

    // Implementing a method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) return null;

        double[][] adjoint = new double[3][3];
        adjoint[0][0] = determinant2x2(new int[][]{{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}});
        adjoint[0][1] = -determinant2x2(new int[][]{{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}});
        adjoint[0][2] = determinant2x2(new int[][]{{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});
        adjoint[1][0] = -determinant2x2(new int[][]{{matrix[0][1], matrix[0][2]}, {matrix[2][1], matrix[2][2]}});
        adjoint[1][1] = determinant2x2(new int[][]{{matrix[0][0], matrix[0][2]}, {matrix[2][0], matrix[2][2]}});
        adjoint[1][2] = -determinant2x2(new int[][]{{matrix[0][0], matrix[0][1]}, {matrix[2][0], matrix[2][1]}});
        adjoint[2][0] = determinant2x2(new int[][]{{matrix[0][1], matrix[0][2]}, {matrix[1][1], matrix[1][2]}});
        adjoint[2][1] = -determinant2x2(new int[][]{{matrix[0][0], matrix[0][2]}, {matrix[1][0], matrix[1][2]}});
        adjoint[2][2] = determinant2x2(new int[][]{{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjoint[j][i] / (double) determinant;
            }
        }
        return inverse;
    }

    // Implementing a method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Overloaded method to display a double matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }
}





