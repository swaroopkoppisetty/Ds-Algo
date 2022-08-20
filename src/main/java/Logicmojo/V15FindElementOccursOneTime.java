package Logicmojo;

//Find the elemet in an array which occurs only one time
public class V15FindElementOccursOneTime {

    static int findElement(int[] arr){
        int res = arr[0];

        for(int i = 1; i < arr.length; i++){
            res ^= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,4,3,4,2,3};
        System.out.println(findElement(arr));
    }
}
