import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Minesweeper2 {

    public static List<String> minesweeper(int N, List<String> vertex){
        char[][] mineBoard = new char[10][10];

        for(char[] row : mineBoard){
            Arrays.fill(row, '.');
        }

        for(String bomb : vertex){
            String myCor[] = bomb.split(",");
            int xCor = Integer.parseInt(myCor[0]) -1;
            int yCor = Integer.parseInt(myCor[1]) -1;

            mineBoard[xCor][yCor] = 'x';
        }

        



    }

    public static void main(String[] args) {
        
    }
    
}
