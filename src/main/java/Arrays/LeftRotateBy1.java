package Arrays;

public class LeftRotateBy1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] res = leftRotate(arr);
        for(int i : res){
            System.out.println(i);
        }
    }

    private static int[] leftRotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i< n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
}
