public class Combination {
    /* 
     * 1 1 1 1 1
     * 1 1 1 2
     * 2 2 1
     * 3 1 1
     * 3 2
    */
    public static int countCombinations(int total, int[] coins) {
        int[] dp = new int[total + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= total; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[total];
    }

    public static void main(String[] args) {
        int total = 5;
        int[] coins = {1, 2, 3};
        int combinations = countCombinations(total, coins);
        System.out.println("Number of combinations to make " + total + " is: " + combinations);
    }
}
