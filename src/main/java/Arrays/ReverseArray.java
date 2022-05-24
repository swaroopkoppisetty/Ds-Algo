package Arrays;

import java.security.InvalidParameterException;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {22,11,33,99,44};
        int[] revArr = reverseArray(arr);

        for(int i : revArr){
            System.out.println(i);
        }
    }

    public static int[] reverseArray(int[] arr){
        if(arr.length == 0)
            throw new InvalidParameterException("Array should n0t be empty");
        int low = 0 , high = arr.length -1 ;
        while (low < high){
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low++;
            high--;
        }
        return arr;
    }
}
