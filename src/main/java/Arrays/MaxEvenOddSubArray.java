package Arrays;

public class MaxEvenOddSubArray {

    public static void main(String[] args) {
        int[] arr = {12,15,14,10,14,13,16};
        System.out.println(efficientSol(arr));
    }

    private static int efficientSol(int[] arr){
        int res = 1;
        int curr = 1;
        for(int i =1; i< arr.length; i++){
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) ||
                    (arr[i-1]%2==0 && arr[i]%2 != 0)){
                curr++;
                res = Math.max(res,curr);
            } else
                curr = 1;
        }
        return res;
    }
}
