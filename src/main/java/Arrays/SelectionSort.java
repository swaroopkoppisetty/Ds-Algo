package Arrays;
/*
    Time Complexity -> O(n^2)
    Unstable sort
    Assume largest as first element and compare with each element
    if nxt element is largest then prev then swap them.
    for every iteration largest will be moved to last element
    We dont need more swaps then bubble sort
*/

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        for(int i = arr.length-1; i>0; i--){

            //assume largest is at first index
            int largest = 0;

            //Iterate and compare each element and find the largest
            for(int j = 1; j<=i; j++){

                if(arr[largest] < arr[j])
                    largest = j;

            }
            //swap largest with last element
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] =  temp;


        }

        //print array
        for(int i : arr)
            System.out.println(i);

    }
}
