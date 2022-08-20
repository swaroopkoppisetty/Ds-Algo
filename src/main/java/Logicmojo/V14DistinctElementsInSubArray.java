package Logicmojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//2 3 2 4 5 4 6 5
public class V14DistinctElementsInSubArray {

    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,4,6,5};
        System.out.println(distinctElements(arr,3));
    }

    static List<Integer> distinctElements(int[] arr, int k){

        int count = 0;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        //find distinct elements in first window
        for(int i = 0; i < k; i++){
            //add element in map if not found else change value
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            } else{
                map.put(arr[i],1);
                count++;
            }
        }
        result.add(count);

        for(int i = k; i < arr.length; i++){

            //remove element from window
            if(map.get(arr[i-k]) > 1){
                int value = map.get(arr[i-k]);
                map.put(arr[i-k],value-1);
            } else{
                map.remove(arr[i-k]);
                count--;
            }

            //add next element in window
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]);
                map.put(arr[i],value);
            } else{
                map.put(arr[i],1);
                count++;
            }

            result.add(count);
        }
        return result;
    }
}
