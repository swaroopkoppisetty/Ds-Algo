package Arrays;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int arr[] = {-5,1,-2,3,-1,2,-2};
        System.out.println(MaxSubArraySum(arr));
        System.out.println(efficentsol(arr));
    }

    //naive sol
    private static int MaxSubArraySum(int arr[]){
        int n = arr.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum += arr[j];
                res = Math.max(res,currSum);
            }
        }
        return res;
    }

    //efficient sol
    private static int efficentsol(int[] arr){
        int max = arr[0];
        int res = arr[0];
        for(int i = 1;i< arr.length;i++) {
            max = Math.max(max +arr[i], arr[i]);
            res = Math.max(res,max);
        }
        return res;
    }
}

