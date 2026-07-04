public class MatrixTransposeDemo {

    public static void main(String[] args) {
        // 1. Initialize a 2D array (Matrix) - 3 rows and 4 columns (3x4)
        int[][] originalMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("--- Original Matrix ---");
        printMatrix(originalMatrix);

        // 2. Compute the Transpose
        int rows = originalMatrix.length;        // 3
        int columns = originalMatrix[0].length;  // 4
        
        // The dimensions of the transpose matrix will be flipped (4x3)
        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Swap rows and columns
                transposeMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("\n--- Transposed Matrix ---");
        printMatrix(transposeMatrix);
    }

    // Helper method to print a 2D array cleanly
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                // Uses formatting to keep elements aligned properly
                System.out.printf("%4d", element);
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}