import java.util.List;
import java.util.ArrayList;

public class Slowestkey {
    public static char slowestKey(List<List<Integer>> keyTimes) {
        List<List<Object>> convertedTimes = new ArrayList<>();
        for (List<Integer> time : keyTimes) {
            List<Object> convertedTime = new ArrayList<>();
            convertedTime.add((char) (time.get(0) + 97));
            convertedTime.add(time.get(1));
            convertedTimes.add(convertedTime);
        }

        char longestKey = '\u0000';
        Integer longestDuration = null;

        for (int i = 0; i < convertedTimes.size() - 1; i++) {
            int start = (i == 0) ? 0 : (int) convertedTimes.get(i - 1).get(1);
            int end = (int) convertedTimes.get(i).get(1);
            char currentChar = (char) convertedTimes.get(i).get(0);
            int interval = end - start;

            if (longestDuration == null || interval > longestDuration) {
                longestDuration = interval;
                longestKey = currentChar;
            }
        }

        return longestKey;
    }

    public static void main(String[] args) {
        List<List<Integer>> keyTimes1 = new ArrayList<>();
        keyTimes1.add(List.of(0, 2));
        keyTimes1.add(List.of(1, 5));
        keyTimes1.add(List.of(0, 9));
        keyTimes1.add(List.of(2, 15));
        char output1 = slowestKey(keyTimes1);
        System.out.println(output1);

        List<List<Integer>> keyTimes2 = new ArrayList<>();
        keyTimes2.add(List.of(0, 2));
        keyTimes2.add(List.of(1, 5));
        keyTimes2.add(List.of(0, 9));
        keyTimes2.add(List.of(2, 15));
        char output2 = slowestKey(keyTimes2);
        System.out.println(output2);
    }
}
