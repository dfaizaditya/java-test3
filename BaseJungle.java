import java.util.*;

public class BaseJungle {

    static class Solution {
        public static int jungle(List<Integer> predator) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 0; i < predator.size(); i++) {
                if (predator.get(i) == -1) {
                    queue.offer(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    if (map.containsKey(predator.get(i))) {
                        list = map.get(predator.get(i));
                    }
                    list.add(i);
                    map.put(predator.get(i), list);
                }
            }

            int res = 0;
            while (!queue.isEmpty()) {
                res++;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int cur = queue.poll();
                    if (map.containsKey(cur)) {
                        for (int l : map.get(cur)) {
                            queue.offer(l);
                        }
                    }
                }

            }
            System.out.println(queue);
            return res;
        }
    }

    public static void main(String[] args) {
        BaseJungle instance = new BaseJungle();
        List<Integer> species = Arrays.asList(-1, 8, 6, 0, 7, 3, 8, 9, -1, 6);
        //System.out.println(instance.minGroupNum(species));
        System.out.println(BaseJungle.Solution.jungle(species));
    }
}
