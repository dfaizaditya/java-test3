import java.util.ArrayList;
import java.util.List;

public class CoinChange2 {
    public static List<List<Integer>> findCombinations(int[] coins, int amount) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationsHelper(coins, amount, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinationsHelper(int[] coins, int remaining, int start, List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < coins.length; i++) {
            if (remaining - coins[i] >= 0) {
                current.add(coins[i]);
                findCombinationsHelper(coins, remaining - coins[i], i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 100;
        int[] coins = {10, 20, 50};
        List<List<Integer>> combinations = findCombinations(coins, n);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
