package Arrays;

public class MaxConsecutive1s {

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1,0,1};
        System.out.println(max1s(arr));
    }

    private static int max1s(int arr[]){
        int n = arr.length;;
        int res = 0;
        int curr = 0;
        for(int i = 0; i < n;i++){
            if(arr[i] == 0)
                 curr = 0;
            else{
                curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}
