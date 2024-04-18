import java.util.Arrays;

public class Visit {

    public static int[] removeIndex(int[] arr, int idx) {
        if (idx < 0 || idx >= arr.length) {
            return arr;
        }

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == idx) {
                continue;
            }

            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static int[] myConcat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }

    public static int[] removeIndex2(int[] arr, int idx) {
        if (idx < 0 || idx >= arr.length) {
            return arr;
        }

        return myConcat(Arrays.copyOfRange(arr, 0, idx), Arrays.copyOfRange(arr, idx + 1, arr.length));
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        int[] modifiedArray = removeIndex(testArray, 2);
        System.out.println(Arrays.toString(modifiedArray)); // Output: [1, 2, 4, 5]

        int[] testArray2 = {6, 7, 8, 9, 10};
        int[] modifiedArray2 = removeIndex2(testArray2, 3);
        System.out.println(Arrays.toString(modifiedArray2)); // Output: [6, 7, 8, 10]
    }
}
