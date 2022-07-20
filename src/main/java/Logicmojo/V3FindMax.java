package Logicmojo;

//fina a max value in an array which is increasing and decreasing
public class V3FindMax {

    public static void main(String[] args) {
        int[] arr = {6,9,15,25,35,50,41,29,23,8};
        System.out.println(findMax(arr,0, arr.length-1));
    }

    public static int findMax(int[] arr, int low, int high){

        //if only one element present in array
        if(low == high)
            return arr[low];

        //if we have 2 elements
        if(high == low + 1)
            return Math.max(arr[low],arr[high]);

        int mid = (low + high)/2;

        //if left and right element is less than mid then we can say it is max
        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1])
            return arr[mid];

        //if left is less and right is more then max will lie on right side
        else if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
            return findMax(arr,mid+1,high);

        //if left is more and right is less then max will lie on left side
        else
            return findMax(arr,low,mid);
    }
}
