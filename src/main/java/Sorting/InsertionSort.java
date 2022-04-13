package Sorting;
/*
    Time complexity -> O(n^2).
    we will populate sorted array from left to right.
    Find correct position to new element to insert in sorted array

*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for(int i =1; i<arr.length; i++){
            int newElement = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > newElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = newElement;
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
