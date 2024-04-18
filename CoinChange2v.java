public class CoinChange2v {
    public static void main(String[] args) {
        int n = 842;
        int k = 91; // Range of coins from 1 to k
        long numCombinations = countCombinations(n, k);
        System.out.println("Number of combinations: " + numCombinations);
    }

    public static long countCombinations(int amount, int k) {
        long[] dp = new long[amount + 1];
        dp[0] = 1;

        for (int coin = 1; coin <= k; coin++) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}
