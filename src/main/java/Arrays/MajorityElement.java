package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,7,8};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr){
        int  n = arr.length;
        int element = arr[0];
        int res = 1;
        for(int i = 0; i < n; i++){
            int count = 1;
            for (int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if(res < count){
                    res = count;
                    element = arr[i];
                }
            }


        }
        System.out.println(element);
        return res;
    }
}
