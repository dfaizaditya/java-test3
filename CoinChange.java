import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int n = 100;
        int[] coins = {10, 20, 50};
        System.out.println(countWays(coins, n));
    }

    public static long countWays(int[] coins, int amount) {
        long[] dp = new long[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}
