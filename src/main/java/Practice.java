
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;

public class Practice {

    static int[] zigZag(int arr[], int n) {
        // code here
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]>arr[i+1] && i%2==0)
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
            else if(arr[i]<arr[i+1] && i%2!=0)
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] = temp;
            }
        }
        return arr;
    }

    static void swap(int i , int j){

    }

    public static void main(String[] args) {
        int[] arr = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
        Arrays.sort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }



}