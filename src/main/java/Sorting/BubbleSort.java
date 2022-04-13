package Sorting;
/*
    Bubble Sort
    Time complexity -> O(n^2)
    This Algo will divide array into 2 partitions Sorted and Unsorted partition.
    For every iteration sorted partition will increase.
    For every iteration one element will occupy right place(largest will be moved to right most)

*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for(int i = arr.length-1; i>0; i--){

            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
