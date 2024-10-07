package level0.lastTwoElements;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConfugation {

    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        int[] num_list = {2, 1, 6};

        // for(int i=0; i<num_list.length; i++){
        //     result.add(num_list[i]);
        // }

        for (int i : num_list) {
            result.add(i);
        }

        int last = num_list[num_list.length-1];
        int beforeLast = num_list[num_list.length-2];

        if(last > beforeLast){
            result.add(last - beforeLast);
        }else{
            result.add(last * 2);
        }

        System.out.println(result);

    }

}
