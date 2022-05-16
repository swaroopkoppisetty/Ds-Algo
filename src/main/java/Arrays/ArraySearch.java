package Arrays;

//Search a element in a given array
// input - [2,9,1,6,5], x = 6
// o/p 3 -index of 6 if we did not found element return -1

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {2,9,1,6,5};
        int x = 6;
        System.out.println(search(arr,x));
    }

    public static int search(int[] arr, int x){
        //assume given element is not there in array
        int res = -1;

        //iterate through array and found element
        for(int i = 0; i<arr.length; i++){
            if(x == arr[i])
                return i;
        }

        return res;
    }

    //Time complexity will be O(n) for worst case
    // O(1) if element is at first - best case
}
