public class AnagramDiff2 {
    // Method to calculate the difference in characters
    public int[] numOfBits(String[] words1, String[] words2) {
        final int alphabetSize = 26;
        int[] diffren = new int[words1.length];


        for(int i = 0; i < words1.length; i++) {
            String word1 = words1[i];
            String word2 = words2[i];

            if(word1.length() != word2.length()) {
                break;

            }
        }




    }

    // Method to display the array
    private static void display(int[] array) {
        for (int diff : array) {
            System.out.print(diff + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        AnagramDiff instance = new AnagramDiff();
        String[] words1 = {"good"};
        String[] words2 = {"dbsa"};
        int[] differences = instance.numOfBits(words1, words2);
        display(differences);
    }
}
