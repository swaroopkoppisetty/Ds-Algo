package Logicmojo;

public class V4MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZerosToEnd(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void moveZerosToEnd(int[] arr){

        int i = 0;
        int cnt = 0;

        while (i < arr.length){

            //move all non zeros elements to left
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[cnt];
                arr[cnt] = temp;
                cnt++;
            }
            i++;
        }
    }
}
