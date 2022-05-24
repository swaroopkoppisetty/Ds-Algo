package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {20,34,5,56,7,22};
        System.out.println(getSecondLargest(arr));
        System.out.println(getSecondLargest2(arr));
    }

    //approach 1 with 2 traversals
    //Time Complexity -> O(n)
    //find the largest value and use that index to find second largest
    private static int getLargest(int arr[]){
        int largest = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[largest] < arr[i]){
                largest = i;
            }
        }
        return  largest;
    }

    private static int getSecondLargest(int[] arr){
        int res = -1;
        int largest = getLargest(arr);

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != arr[largest]){
                if(res == -1)
                    res = i;
                else if(arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }

    //approach 2 with only 1 traversal
    //Time complexity O(n)
    private static int getSecondLargest2(int[] arr){
        int res = -1 ,largest =0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == i || arr[res] < arr[i])
                    res = i;
            }
        }
        return res;
    }
}
