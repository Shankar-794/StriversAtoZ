// Solution class to find the (r, c) element of Pascal's Triangle
class Solution3 {
    // Function to compute binomial coefficient (nCr)
    public long findPascalElement(int r, int c) {
        // Element is C(r-1, c-1)
        int n = r - 1;
        int k = c - 1;

        long result = 1;

        // Compute C(n, k) using iterative formula
        for (int i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }
}

// Main class to test the solution
public class Approach3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int r = 5, c = 3;
        System.out.println(sol.findPascalElement(r, c));
    }
}
