package Logicmojo;

public class V2MergeSort {

    public static void main(String[] args) {

        int arr[] = {8,4,3,12,21,19,72,6};
        int res[] = new int[arr.length];
        mergeSort(arr,res,0, arr.length-1);
        for(int i : arr){
            System.out.println(i);
        }

    }

    public static void merge(int[] arr, int[] res, int low, int mid, int high){
        int i = low; int k = low; int j = mid + 1;

        //divide array into 2 parts 0 to mid and mid + 1 to high  and compare
        while(i <= mid && j <=high){
            if(arr[i] <= arr[j])
                res[k++] = arr[i++];
            else
                res[k++] = arr[j++];
        }

        //incase if any elements are leftout on left subarray
        while (i <= mid){
            res[k++] = arr[i++];
        }

        //incase if any elements are leftout on right subarray
        while (j <= high){
            res[k++] = arr[j++];
        }

        for(i = 0; i <=high; i++){
            arr[i] = res[i];
        }
    }

    public static void mergeSort(int[] arr, int[] res, int low, int high){
        if(high == low){
            return;
        }

        int mid = (low + high)/2;
        mergeSort(arr,res,low,mid);
        mergeSort(arr,res,mid+1,high);
        merge(arr,res,low,mid,high);
    }
}
