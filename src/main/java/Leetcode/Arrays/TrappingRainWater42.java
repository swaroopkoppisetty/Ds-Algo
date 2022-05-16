package Leetcode.Arrays;

public class TrappingRainWater42 {

    public static void main(String[] args) {

        int[] arr = {3,2,4,6,0};
        int res = 0;

        for(int i = 0; i < arr.length; i++){
            int lMax = arr[0];
            for(int j = 0; j<i; j++){
                if(lMax < arr[j])
                    lMax = arr[j];
            }

            int rMax = arr[arr.length-1];
            for(int j = arr.length - 2; j > i; j--){
                if(rMax < arr[j])
                    rMax = arr[j];
            }
            System.out.println(lMax + " " + rMax + " " + arr[i]);
            res += Math.max(Math.min(lMax,rMax)-arr[i],0);
        }

        System.out.println(res);

    }


}
