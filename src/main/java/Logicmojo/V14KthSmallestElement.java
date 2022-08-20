package Logicmojo;

public class V14KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {54, 26, 93, 17, 77, 31, 44,20,55};
        int k = 4;
        System.out.println(k + "th smallest element is " + kthSmallestElement(arr,k,0,arr.length-1));
    }

    private static int kthSmallestElement(int[] arr, int k, int low, int high) {

        if(k > arr.length){
            return Integer.MAX_VALUE;
        }

        //get the pivotPoint for lastElement
        int pivotPoint = getPivotPoint(arr,low,high);

        //if pivotPoint is equal to kth index return it
        if(pivotPoint == k-1) return arr[pivotPoint];

        //if pivotPoint is less than k then we need to check right side
        if(pivotPoint < k-1) return kthSmallestElement(arr,k,pivotPoint+1,high);

        //else check left side
        else return kthSmallestElement(arr,k,low,pivotPoint-1);


    }

    private static int getPivotPoint(int[] arr, int low, int high) {

        int pivotElement = arr[high];
        int pivotPoint = low;

        for(int i = low; i < high; i++){
            if(arr[i] < pivotElement){
                int temp = arr[i];
                arr[i] = arr[pivotPoint];
                arr[pivotPoint] = temp;
                pivotPoint++;
            }
        }

        int temp = arr[pivotPoint];
        arr[pivotPoint] = arr[high];
        arr[high] = temp;

        return  pivotPoint;
    }
}
