package Arrays;
// {10,20,20,30,30,30}
public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,30};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr){
        int res = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[res - 1] != arr[i]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
