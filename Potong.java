public class Potong {

    public static int[][] removeRow(int[][] arr, int a) {
        int[][] result = new int[arr.length - 1][arr[0].length];
        System.arraycopy(arr, 0, result, 0, a);
        System.arraycopy(arr, a + 1, result, a, arr.length - a - 1);
        return result;
    }

     static int[][] removeCol(int[][] arr, int b){
        int[][] result = new int[arr.length - 1][arr[0].length];

        for(int i = 0; i< arr.length; i++){
            System.arraycopy(arr[i], 0, result[i], 0, b);
            System.arraycopy(arr[i], b+1, result[i], b, arr[i].length - b -1);
        }
        

        return result;
    }

      // Helper method to print a 2D array
      private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // Print the original array
        System.out.println("Original Array:");
        printArray(arr);
        
        // Test the removeRow method
        int[][] result = Potong.removeRow(arr, 1);
        
        // Print the modified array
        System.out.println("Modified Array:");
        printArray(result);
    }

}