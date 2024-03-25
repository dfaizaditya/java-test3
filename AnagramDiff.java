public class AnagramDiff {
    // Method to calculate the difference in characters
    public int[] numOfBits(String[] words1, String[] words2) {
        final int alphabetSize = 26;
        int[] differences = new int[words1.length];
        
        for (int i = 0; i < words1.length; i++) {
            String word1 = words1[i];
            String word2 = words2[i];
            
            // If the lengths are different, they can't be anagrams
            if (word1.length() != word2.length()) {
                differences[i] = -1;
                continue;
            }
            
            differences[i] = getCharacterDifferences(word1, word2);
        }
        
        return differences;
    }

    // Method to find the number of character differences between two words
    private int getCharacterDifferences(String word1, String word2) {
        int[] counts = new int[26];
        for (char c : word1.toCharArray()) {
            counts[c - 'a']++;
        }
        
        int differences = 0;
        for (char c : word2.toCharArray()) {
            if (counts[c - 'a'] > 0) {
                counts[c - 'a']--;
            } else {
                differences++;
            }
        }
        
        return differences;
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
