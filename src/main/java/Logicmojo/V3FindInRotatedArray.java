package Logicmojo;

// find the element ind rotated Array
public class V3FindInRotatedArray {

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9,10,1,2};
        System.out.println(findElemet(arr,0, arr.length -1 , 11));
    }

    public static int findElemet(int[] arr, int low , int high, int element){

        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;

        if(arr[mid] == element)
            return mid;

       if(arr[low] <= arr[mid]){

           if(element >= arr[low] && element <= arr[mid])
               return findElemet(arr,low,mid-1,element);

           return findElemet(arr,mid+1,high,element);
       }

       if(element >= arr[mid] && element <= arr[high])
           return findElemet(arr,mid+1,high,element);

       return findElemet(arr,low,mid-1,element);
    }
}
