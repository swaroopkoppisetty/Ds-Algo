package Logicmojo;

import java.util.ArrayList;
import java.util.HashMap;

public class V12FindSubArraysWith0Sum {

    public static void main(String[] args) {
        int[] arr = {6,-6,-2,5,-3,7,-6,-1,4};
        System.out.println(subArraysWithSum0(arr));
    }

    static class SubArray{
        int start; int end;

        public SubArray(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "SubArray{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }

    // 6 3 -2 5 -3 7 -6 -1 4
    static ArrayList<SubArray> subArraysWithSum0(int[] array){

        int n = array.length;
        int sum = 0;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<SubArray> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            sum += array[i];

            if(sum == 0){
                result.add(new SubArray(0,i));
            }
            ArrayList<Integer> list = new ArrayList<>();

            if(map.containsKey(sum)){
                list = map.get(sum);
                for (int j = 0; j < list.size(); j++){
                    result.add(new SubArray(list.get(j) + 1,i));
                }
            }
            list.add(i);
            map.put(sum,list);

        }

        return result;

    }
}
