package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Frequencies {

    private static Map<Integer,Integer> frequencies(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                int k = map.get(arr[i]);
                k++;
                map.put(arr[i],k);
            } else{
                map.put(arr[i],1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {10,10,10};
        Map<Integer, Integer> map = frequencies(arr);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
