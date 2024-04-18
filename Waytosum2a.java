public class Waytosum2a {

    static int NumberOfways(int N, int K) {
        // Initialize a list
        int[] dp = new int[N + 1];

        dp[0] = 1;

        for (int i = 1; i <= K; i++) {
            for (int j = i; j <= N; j++) {
                dp[j] += dp[j - i];
            }
        }

        return dp[N];
    }

    // Driver code
    public static void main(String[] args) {
        // Given inputs
        int N = 10;
        int K = 3;
        System.out.println(NumberOfways(N, K));
    }

}
