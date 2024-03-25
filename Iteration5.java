import java.util.Scanner;
import java.util.Arrays;

public class Iteration5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOuterIterations = scanner.nextInt();

        for (int j = 0; j < numOuterIterations; j++) {
            int numIterations = scanner.nextInt();

            int[] numbers = new int[numIterations];
            for (int i = 0; i < numIterations; i++) {
                numbers[i] = scanner.nextInt();
            }
            int length = calculate(numbers);
            System.out.println(length);
        }

        scanner.close();
    }

    public static int calculate(int[] numbers) {
        int numRows = numbers.length;

        int numCols = Arrays.stream(numbers).max().orElse(0); // Find the maximum value in the array.

        int iterations = 0;
        while (numCols > 0) { // Ensure we don't enter an infinite loop
            boolean allZeroes = true;
            for (int i = 0; i < numRows; i++) {
                if (numbers[i] > 0) {
                    allZeroes = false;
                    numbers[i]--; // Decrease the value at the first position in each row
                }
            }
            if (allZeroes) // Break the loop if all elements are zero
                break;
            iterations++;
            numCols--; // Reduce the number of columns
        }

        return iterations;
    }
}
