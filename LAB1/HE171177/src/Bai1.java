

import java.util.Scanner;

public class Bai1 {

    static void sortDESC(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = i; k < rows; k++) {
                    for (int l = (k == i ? j + 1 : 0); l < cols; l++) {
                        if (matrix[k][l] > matrix[i][j]) {
                            int temp = matrix[k][l];
                            matrix[k][l] = matrix[i][j];
                            matrix[i][j] = temp;
                        }
                    }
                }
            }
        }
    }
    
    

    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix entered:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        // Calculate the sum and average of the matrix
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ((float) sum / (rows * cols)));

        // Sort the matrix descending on each row 
        sortDESC(matrix);
        System.out.println("Sorted matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();

        }
    }
}
