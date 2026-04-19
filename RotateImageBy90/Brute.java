class BruteSolution{
    public int[][] rotateClockwise(int[][] matrix) {
        // Get the size of the square matrix
        int n = matrix.length;

        // Create a new matrix of same size to store rotated result
        int[][] rotated = new int[n][n];

        // Traverse each element of original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Place the element at its new rotated position
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        // Return the rotated matrix
        return rotated;
    }
}
public class Brute {
    public static void main(String[] args) {
        BruteSolution sol = new BruteSolution();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] rotated = sol.rotateClockwise(mat);

        // Print the rotated matrix
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
