import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Jungle2 {

    public static int junglebook(List<Integer> predators){
        Map<Integer,List<Integer>> myMap = new HashMap<>();
        Queue<Integer> que = new LinkedList<Integer>();

        for(int i=0; i<predators.size(); i++){
            if(predators.get(i) == -1){
                que.offer(i);
            }else{
                List<Integer> Nlist = new ArrayList<>();
                if(myMap.containsKey(predators.get(i))){
                    Nlist = myMap.get(predators.get(i));
                }
                Nlist.add(i);
                myMap.put(predators.get(i), Nlist);

            }
        }

        int res = 0;
        while(!que.isEmpty()){
            int size = que.size();
            for(int i = 0; i <size; i++){
                int curr = queue.poll();
                for()

            }

        }



    }

    public static void main(String[] args){

    }
    
}
