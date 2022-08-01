package Logicmojo;
//find majority element i.e number which appears more than half of the array's length
public class V9MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2,3,3,2,2,5,2,3,1,2,2};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] arr){
        int majority = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] == majority)
                count++;
            else
                count--;

            if(count == 0){
                majority = arr[i];
                count = 1;
            }
        }

        return majority;
    }
}
