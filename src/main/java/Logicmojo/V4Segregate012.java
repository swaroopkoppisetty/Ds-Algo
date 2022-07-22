package Logicmojo;

//Sort 0s 1s and 2s
public class V4Segregate012 {

    public static void main(String[] args) {
        int[] arr = {2,1,1,0,1,2,1,2,0,0,0,1};
        Sort012(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void Sort012(int[] array)
    {
       int start = 0;
       int mid = 0;
       int end = array.length - 1;

       while (mid <= end){

           if(array[mid] == 0){
               swap(array,mid,start);
               start++;
               mid++;
           }
           else if(array[mid] == 2){
               swap(array,end,mid);
               end--;
           }
           else {
               mid++;
           }
       }
    }

    private static void swap(int[] array , int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
