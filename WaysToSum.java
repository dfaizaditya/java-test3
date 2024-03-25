class WaysToSum {
    // Function to find the total number of
    // ways to represent N as the sum of
    // integers over the range [1, K]
    static int NumberOfways(int N, int K) {
        // Initialize a list
        int[] dp = new int[N + 1]; // size of N + 1
        // Update dp[0] to 1
        dp[0] = 1;
        // Iterate over the range [1, K + 1]
        for (int row = 1; row < K + 1; row++) {
            // Iterate over the range [row, N + 1]
            for (int col = row; col < N + 1; col++) {
                // If col is greater
                // than or equal to row
                dp[col] += dp[col - row];
            }
        }
        // Return the total number of ways
        return dp[N];
    }

    // Driver code
    public static void main(String[] args) {
        // Given inputs
        int N = 842;
        int K = 91;
        System.out.println(NumberOfways(N, K));
    }
}
