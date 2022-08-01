package Arrays;

public class MaxSumCirSubArray {

    public static void main(String[] args) {
        int arr[] = {8,-4,3,-5,4};
        System.out.println(maxNormal(arr));
        System.out.println(maxCircular(arr));
    }

    private static int maxNormal(int[] arr){
        int res = arr[0], maxEnding = arr[0];
        for(int i = 1; i< arr.length; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    private static int maxCircular(int[] arr){
        int maxNormal = maxNormal(arr);
        if(maxNormal < 0)
            return maxNormal;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int cirSum = sum + maxNormal(arr);
        return Math.max(maxNormal,cirSum);
    }


}
