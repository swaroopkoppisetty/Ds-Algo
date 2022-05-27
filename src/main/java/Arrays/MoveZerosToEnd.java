package Arrays;
//i/p {0,0,20,30,0,0,40}
//o/p {20,30,40,0,0,0,0}
public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0,0,20,30,0,0,40};
        int[] res = moveZeros(arr);
        for(int i : res){
            System.out.println(i);
        }
    }

    private static int[] moveZeros(int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        return arr;

    }
}
