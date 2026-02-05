package Lab1;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int row, int col){
        Random rand = new Random();
        int[][] matrix = new int[row][col];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j]=rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }
    public static int[][] transposeMatrix(int[][] matrix){
        if (matrix!=null && matrix.length>0 && matrix[0].length>0) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[][] tMatrix = new int[col][row];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    tMatrix[i][j] = matrix[j][i];
                }
            }
            return tMatrix;
        }
        else{
            return new int[0][0];
        }
    }
    public static int maxValueInColums(int[][] matrix){
        if (matrix!=null && matrix.length>0 && matrix[0].length>0){
            int sum=0;
            for (int i=0; i<matrix[0].length; i++) {
                int max = Integer.MIN_VALUE;
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[j][i] > max) {
                        max = matrix[j][i];
                    }
                }
                sum+=max;
            }
            return sum;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input quantaty of row in Matrix:");
        int rowCount = sc.nextInt();
        System.out.println("Input quantaty of col in Matrix:");
        int colCount = sc.nextInt();
        int[][] matrixB = generateMatrix(rowCount, colCount);
        int[][] matrixC = transposeMatrix(matrixB);

        System.out.println("Matrix B");
        printMatrix(matrixB);

        System.out.println("Matrix C");
        printMatrix(matrixC);

        System.out.printf("Sum of max values in columns of Matrix C: %d\n", maxValueInColums(matrixC));
    }
}