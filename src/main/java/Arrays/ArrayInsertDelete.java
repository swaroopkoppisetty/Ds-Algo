package Arrays;

//insert a element in an array at given position
public class ArrayInsertDelete {
    public static void main(String[] args) {
        int cap = 6;
        int[] arr = new int[cap];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 7;
        int x = 5;
        int pos = 2;

        int[] res = insert(arr,x,pos,cap);
        for(int i : res){
            System.out.println(i);
        }
    }
    public static int[] insert(int[] arr, int x, int pos, int cap){
        int n = arr.length;
        if(pos > cap){
            return arr;
        }
        int idx = pos - 1;

        for(int i = n-1; i <= idx; i--){
            arr[i+1] = arr[i];
        }
        arr[idx] = x;
        return arr;

    }

    public  static int delete(int[] arr, int x){
        int n = arr.length;
        int idx = -1;

        for(int i = 0; i <n; i++){
            if(x == arr[i]){
                idx = i;
                break;
            }
        }
        if( idx >= 0){
            for(int i = n-1; i <=idx; i--){
                arr[i-1] = arr[i];
            }
            return n - 1;
        } else
            return n;
    }
}
