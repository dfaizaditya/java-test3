public class Waytosum2 {
    public static int NumberOfways(int N, int K)
    {
        // Base case
        if (N == 0)
            return 1;
        if (N < 0 || K <= 0)
            return 0;
 
        // including and not including K in sum
        return NumberOfways(N - K, K)
            + NumberOfways(N, K - 1);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int N = 842;
        int K = 91;
 
        // function call
        System.out.println(NumberOfways(N, K));
    }
    
}
