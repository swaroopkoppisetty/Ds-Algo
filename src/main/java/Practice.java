
import java.util.*;

public class Practice {

    public static void main(String[] args) {

        int[] arr = {1,4,3,5,7};
        int d = 2;
        // 4,1,3,5,7
        //4,1,7,5,3
        //3,5,7,1,4
        int start = 0;
        int end = d -1;
        for(int i = 0;  i < d; i++){
            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        start = d;
        end = arr.length -1 ;

        for(int i = d +1; i < arr.length; i++){

            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        start = 0;
        end = arr.length -1;
        for(int i = 0; i < arr.length; i++){

            if(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }

        for(int i : arr){
            System.out.println(i);
        }



    }




}