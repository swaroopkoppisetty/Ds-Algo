package Logicmojo;

import java.util.HashMap;
import java.util.Map;

public class V9CountFrequency {

    public static void main(String[] args) {
        int[] arr = {5,2,7,7,2,5,5};
        countFrequencies(arr);
    }

    static void countFrequencies(int[] arr){
        int n = arr.length;

        //{4,1,6,6,1,4,4}
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] - 1;
        }

        //add the elements to their index
        for(int i = 0; i < n; i++){
            arr[arr[i] % n] +=n;
        }

        for(int i = 0; i < n; i++){
            int count = arr[i]/n;
            if(count > 0)
                System.out.println(i+1 + " " + count);
        }
    }
}
