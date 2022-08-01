package Logicmojo;

import java.util.Arrays;

// find the immediate greater number with same set of digits
public class V6FindNextGreater {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        findNextGreater(arr,arr.length);
        for (int i : arr){
            System.out.println(i);
        }
    }

    private static void findNextGreater(int[] arr,int n) {
        int i = 0;
        for(i = n -1; i > 0 ; i--){
            if(arr[i - 1] < arr[i]) {
                break;
            }
        }
        if(i == 0){
            System.out.println("Not Possible");
        }

        else {
            int element = arr[i - 1];
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > element && arr[min] > arr[j])
                    min = j;
            }

            int temp = arr[i - 1];
            arr[i - 1] = arr[min];
            arr[min] = temp;
            Arrays.sort(arr, i, n);
        }
    }
}
