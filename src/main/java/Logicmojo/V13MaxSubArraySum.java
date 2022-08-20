package Logicmojo;

public class V13MaxSubArraySum {

    static int maxSumOfSubArray(int[] arr , int n){
        int currSum = arr[0];
        int maxSum = currSum;

        for (int i = 1; i < n; i++) {
           currSum = Math.max(arr[i], currSum + arr[i]);
           maxSum = Math.max(currSum,maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-5,6,-7,1,4,-1,16};
        System.out.println(maxSumOfSubArray(arr,arr.length));
    }
}
