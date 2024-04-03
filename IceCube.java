import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCube {

    public int[] myCut(int[] array){

        int[] newArr = Arrays.copyOfRange(array,1, array.length-1);
        return newArr;
    }

    public List<Integer> mycutList(List<Integer> list){

        List<Integer> newList = list.subList(1,list.size()-1);;
        return newList;

    }

    public int[] inArray(){
        int[] arr = {1,2,4,5};
        return myCut(arr);
    }

    // public int myCount(int[] num){
    //     num 

    //     return 0;
    // }

    public static void main(String[] args){
        IceCube inCube = new IceCube();

        System.out.println(inCube.inArray());

    }
    
}
