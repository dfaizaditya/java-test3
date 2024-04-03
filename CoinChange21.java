import java.util.ArrayList;
import java.util.List;

public class CoinChange21 {

    public static List<List<Integer>> myChan(int[] arr, int amo){

        List<List<Integer>> dp = new ArrayList<List<Integer>>();
        List<Integer> mNew = new ArrayList<>();
        myCount(arr, amo, 0, mNew, dp);

        return dp;

    }

    public static void myCount(int[] coins, int remain, int start, List<Integer> current, List<List<Integer>> result){

        if(remain ==0){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = 0; i < coins.length; i++){
            
        }
    }

    public static void main(String[] args) {
        
    }
    
}
