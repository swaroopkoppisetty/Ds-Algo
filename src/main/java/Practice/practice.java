package Practice;
class practice {

    public static void main(String[] args) {
        int[] arr = {5,6,9,8,2};
        int d = 3;
        leftRotate(arr,d);
        for(int i : arr){
            System.out.println(i);
        }
    }

    private static int[] leftRotate(int[] arr, int d){
        int n = arr.length;
        if(d > n){
            d = d - n;
        }
        //reverse 0 to d elements
        reverse(arr,0,d-1);
        //reverse d+1 to n elements
        reverse(arr,d,n-1);
        //reverse whole Array
        reverse(arr,0, n-1);
        return arr;
    }

    private static int[] reverse(int[] arr,int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }


}