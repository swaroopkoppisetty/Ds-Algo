package Arrays;

public class MaxDifference {

    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        System.out.println(maxDifference(arr));
    }

    private static int maxDifference(int[] arr){
        int res = Integer.MIN_VALUE;
        int n = arr.length;
        int min = arr[0];

        for(int i = 1; i < n; i++){

            int diff = arr[i] - min;
            if(diff > res)
                res = diff;

            if(min > arr[i])
                min = arr[i];
        }

        return res;
    }


}
