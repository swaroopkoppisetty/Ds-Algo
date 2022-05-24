package Arrays;

public class SortedArrayCheck {
    public static void main(String[] args) {
        int[] arr = {23,43,44,63};
        System.out.println(checkSortedArray(arr));
    }

    private static boolean checkSortedArray(int[] arr){
        boolean res = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1])
                res = false;
        }
        return res;
    }
}
