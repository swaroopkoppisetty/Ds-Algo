package Logicmojo;

//remove duplicates from sorted array
public class V5RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5};
        removeDuplicates(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void removeDuplicates(int[] arr){
        int i = 1;
        int a = arr[0];
        int b = 1;

        while (i < arr.length){

            if(arr[i] == a){
                i++;
            }
            else {
                a = arr[i];
                arr[b++] = arr[i++];
            }
        }
    }
}
