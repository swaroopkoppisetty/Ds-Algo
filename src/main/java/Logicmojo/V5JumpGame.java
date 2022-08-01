package Logicmojo;

// Jump to the last index
public class V5JumpGame {

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1};
        System.out.println(jump(arr));
    }

    public static int jump(int[] arr){

        if(arr[0] == 0){
            return 0;
        }
        if(arr.length == 1){
            return 0;
        }
        int jump = 0;
        int a = arr[0], b = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(i == arr.length -1){
                jump++;
                return jump;
            }
            a--;
            b--;

            if(arr[i] > b){
                b = arr[i];
            }

            if(a == 0){
                jump++;
                a=b;
            }
            if(b == 0){
                return 0;
            }
        }

        return jump;
    }
}
