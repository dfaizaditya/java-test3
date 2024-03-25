import java.util.*;

class junglebook {
        public static int jungle(List<Integer> predators) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 0; i < predators.size(); i++) {
                if (predators.get(i) == -1) {
                    queue.offer(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    if (map.containsKey(predators.get(i))) {
                        list = map.get(predators.get(i));
                    }
                    list.add(i);
                    map.put(predators.get(i), list);
                }
            }

            System.out.println(map);
            System.out.println(queue);


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
            return res;
        }


        public static void main(String[] args) {
        List<Integer> species = Arrays.asList(4, 1, -1, 3, -1);
        //System.out.println(instance.minGroupNum(species));
        System.out.println(jungle(species));

        List<Integer> species2 = Arrays.asList(-1, 8, 6, 0, 7, 3, 8, 9, -1, 6);
        //System.out.println(instance.minGroupNum(species));
        System.out.println(jungle(species2));
    }

}
