package Logicmojo;

public class V6FindMiddle {

    public static void main(String[] args) {


        int[] arr = {6,2,5,4,7,9,11,8,10};
        int i = find(arr);
        System.out.println(arr[i]);
    }

    public static int find(int[] arr){

        int n = arr.length;

        // find left max for every element
        int[] left = new int[n];
        left[0] = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){
            left[i] = Math.max(arr[i-1],left[i-1]);
        }

        int right = Integer.MAX_VALUE;

        // find right minimum and compare
        for(int i = n-1; i>=0; i--){
            if(arr[i] > left[i] && arr[i] < right)
                return i;
            right = Math.min(right,arr[i]);
        }

        return -1;
    }

}
