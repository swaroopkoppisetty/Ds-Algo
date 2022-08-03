package Logicmojo;

//Sort 0s 1s and 2s
public class V4Segregate012 {

    public static void main(String[] args) {
        int[] arr = {0,2,0,1,2};
        Sort012(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void Sort012(int[] array)
    {
       int left = 0;
       int i = 0;
       int right = array.length - 1;

       while (i <= right){

           if(array[i] == 0){
               swap(array,i,left);
               left++;
               i++;
           }
           else if(array[i] == 2){
               swap(array,i,right);
               right--;
           }
           else {
               i++;
           }
       }
    }

    private static void swap(int[] array , int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
