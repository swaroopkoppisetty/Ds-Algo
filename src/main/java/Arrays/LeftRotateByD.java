package Arrays;

public class LeftRotateByD {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] res = leftRotate(arr,7);
        for(int i : res){
            System.out.println(i);
        }
    }

    private static int[] leftRotate(int[] arr, int d){
        int n = arr.length;
        if(d > n){
            d = d - n;
        }
        //reverse d elements
        reverse(arr,0,d-1);
        //reverse d+1 to n elements
        reverse(arr,d,n-1);
        //reverse whole Array
        reverse(arr,0, n-1);
        return arr;
    }

    private static int[] reverse(int[] arr,int low, int high){
       // int low = 0, high = arr.length;
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }
}

