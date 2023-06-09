
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the colunms: ");
        cols = sc.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Matrix Inputted:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (float) sum / (rows * cols));
        //  Sort the matrix descending on each row 
        for (int i = 0; i < rows; i++) {
           int array[] = new int[cols];
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - j - 1];
                matrix[i][cols - j - 1] = temp;
            }
        }

        System.out.println("Sorted matrix:");
       for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d", matrix[i][j]);
            }
            System.out.println();
        } 
    }
}
       

   