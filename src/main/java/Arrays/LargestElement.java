package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {23,56,75,22,15};
        System.out.println(largest(arr));
    }

    public static int largest(int arr[]){
        int largest = 0;

        for(int i = 1; i< arr.length; i++){
            if(arr[largest] < arr[i]){
                largest = i;
            }
        }
        return largest;
    }
}
