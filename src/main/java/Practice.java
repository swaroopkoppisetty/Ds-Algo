
import java.math.BigDecimal;
import java.util.*;

public class Practice {

    public static void main(String[] args) {

        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        move0s(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void move0s(int[] arr){

        int i = 0;
        int count = 0;
        while (i < arr.length){

            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
            i++;
        }
    }


}