import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Minesweeper {

    public static List<String> minesweeper(int N, List<String> bom) {
        char[][] mineBoard = new char[10][10]; // Fixed size of 10x10

        for (char[] row : mineBoard) {
            Arrays.fill(row, '.');
        }
        
        for (String bomb : bom) {
            String[] coordinates = bomb.split(",");
            int row = Integer.parseInt(coordinates[0]) - 1; 
            int col = Integer.parseInt(coordinates[1]) - 1;
            if (row >= 0 && row < 10 && col >= 0 && col < 10) { // Check bounds for 10x10 board
                mineBoard[row][col] = 'x';
            }
        }
        
        for (int i = 0; i < 10; i++) { // Iterate through each cell
            for (int j = 0; j < 10; j++) {
                if (mineBoard[i][j] != 'x') { // If not a bomb cell
                    int count = countValue(mineBoard, i, j);
                    if (count > 0)
                        mineBoard[i][j] = (char) (count + '0');
                }
            }
        }
        
        return Arrays.stream(mineBoard)
                     .map(String::new)
                     .collect(Collectors.toList()); 
    }
    
    private static int countValue(char[][] board, int row, int col) {
        int count = 0;
        // Iterate through the neighboring cells
        for (int i = Math.max(0, row - 1); i <= Math.min(9, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(9, col + 1); j++) {
                if (board[i][j] == 'x') // If bomb found
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 2; // Number of bombs
        List<String> bombs = List.of(
            "1,2","2,9", "4,2", "5,2", "6,2", "4,7", "7,3", "7,4",
            "7,11", "9,2", "11,6", "11,7"
        ); // Bomb locations

        List<String> result = minesweeper(N, bombs);

        for (String row : result) {
            System.out.println(row);
        }
    }
}
