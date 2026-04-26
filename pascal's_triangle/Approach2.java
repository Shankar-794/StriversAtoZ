import java.util.*;

// Class containing Pascal's Triangle row generation logic
class Solution2 {
    // Function to generate the Nth row of Pascal's Triangle
    public List<Long> getNthRow(int N) {
        // Result list to store the row
        List<Long> row = new ArrayList<>();
        
        // First value of the row is always 1
        long val = 1;
        row.add(val);
        
        // Compute remaining values using the relation:
        // C(n, k) = C(n, k-1) * (n-k) / k
        for (int k = 1; k < N; k++) {
            val = val * (N - k) / k;
            row.add(val);
        }
        
        return row;
    }
}

public class Approach2 {
    public static void main(String[] args) {
        int N = 5; // Example: 5th row
        Solution2 sol = new Solution2();
        List<Long> result = sol.getNthRow(N);

        // Print the row
        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
