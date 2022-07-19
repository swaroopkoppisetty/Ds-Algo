package Logicmojo;

public class V1BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10};
        int start = 0;
        int end = arr.length -1;
        boolean result = binarySearchIterative(arr,4);
        if(result){
            System.out.println("Found");
        } else
            System.out.println("Not Found");
    }

    public static boolean binarySearchRecursive(int[] arr, int start, int end, int searchElement){

        if(start > end){
            return false;
        }
        int middle = (start + end)/2;

        if(arr[middle] == searchElement){
            return true;
        }

        else if(arr[middle] < searchElement){
            return binarySearchRecursive(arr, middle + 1, end,searchElement);
        }

        else {
           return binarySearchRecursive(arr,start,middle-1,searchElement);
        }

    }

    public static boolean binarySearchIterative(int[] arr, int element){
        int low = 0;
        int high = arr.length -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == element)
                return true;
            else if(arr[mid] > element)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}
