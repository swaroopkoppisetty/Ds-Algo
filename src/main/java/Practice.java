import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

int arr1[] = {1,-2,-5,0,10};
int arr2[] = {0,-2,-1,-7,-4};
        System.out.println(maximumExp(arr1,arr2));
    }

    public static  int maximumExp(int[] arr1,int[] arr2){
        int max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE,
                max3 = Integer.MIN_VALUE,
                max4 = Integer.MIN_VALUE,
                min1=Integer.MAX_VALUE,
                min2 = Integer.MAX_VALUE,
                min3=Integer.MAX_VALUE,
                min4 = Integer.MAX_VALUE;

         for(int i =0; i <arr1.length; i++){
             max1 = Math.max(max1,arr1[i]+arr2[i]+i);
             min1 = Math.min(min1,arr1[i]+arr2[i]+i);
             max2 = Math.max(max2,arr2[i]+arr1[i]-i);
             min2 = Math.min(min2,arr2[i]+arr1[i]-i);
             max3 = Math.max(max3,arr2[i]-arr1[i]+i);
             min3 = Math.min(min3,arr2[i]-arr1[i]+i);
             max4 = Math.max(max4,arr1[i]-arr2[i]+i);
             min4 = Math.min(min4,arr1[i]-arr2[i]+i);


         }

         return Math.max(Math.max(max1 - min1,max2 - min2),Math.max(max3 - min3,max4 - min4));

    }
}