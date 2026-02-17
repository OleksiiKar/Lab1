package Lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Random;

public class MainTest {

    @Test
    public void testGenerateMatrixSize() {
        int[][] matrix = Main.generateMatrix(3, 4);
        assertEquals(3, matrix.length);
        assertEquals(4, matrix[0].length);
    }

    @Test
    public void testGenerateMatrixValues() {
        int[][] matrix = Main.generateMatrix(2, 2);
        for (int[] row : matrix) {
            for (int val : row) {
                assertTrue(val >= 1 && val <= 10);
            }
        }
    }

    @Test
    public void testTransposeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposed = Main.transposeMatrix(matrix);
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        assertArrayEquals(expected, transposed);
    }

    @Test
    public void testMaxInColumn() {
        int[][] matrix = {{1, 5}, {4, 2}, {3, 7}};
        assertEquals(11, Main.maxValueInColums(matrix));
        int[][] matrixEmpty = {};
        assertEquals(0, Main.maxValueInColums(matrixEmpty));
    }

    @Test
    public void testSquareMatrixTranspose() {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] transposed = Main.transposeMatrix(matrix);
        int[][] expected = {{1, 3}, {2, 4}};
        assertArrayEquals(expected, transposed);
    }

    @Test
    public void testEmptyMatrix() {
        int[][] matrix = new int[0][0];
        int[][] transposed = Main.transposeMatrix(matrix);
        assertEquals(0, transposed.length);
    }
}

