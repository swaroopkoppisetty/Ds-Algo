package Logicmojo;

// find the next smallest palindrome
public class V13NextPalindrome {

    static void nextPalindrome(int[] arr, int n){

        int mid = n/2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;
        boolean leftSmaller = false;

        //check if number is already palindrome
        while(i >= 0 && arr[i] == arr[j]){
            i--;
            j++;
        }

        //check leftSmaller even if number is palindrome
        if(i < 0 || arr[i] < arr[j]){
            leftSmaller = true;
        }

        //override right numbers with left numbers
        while(i >= 0){
            arr[j++] = arr[i--];
        }

        // add +1 to left number when it is small
        if(leftSmaller){
            int carry = 1;

            if(n %2 == 1){
                arr[mid] += 1;
                carry = arr[mid]/10;
                arr[mid] %= 10;
            }
            i = mid - 1;
            j = (n % 2 == 0) ? mid : mid + 1;

            while (i >=0 && carry > 0){
                arr[i] = arr[i] + carry;
                carry = arr[i]/10;
                arr[i] = arr[i]%10;
                arr[j++] = arr[i--];
            }

        }
    }

    static boolean isAll9s(int[] arr , int n){
        int i = 0;
        while (i < n){
            if(arr[i] != 9)
                return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        if(isAll9s(arr,n)){
            System.out.print(1);
            for(int i = 0; i < n -1; i++){
                System.out.print(0);
            }
            System.out.print(1);
        } else{
            nextPalindrome(arr,n);
            for (int i : arr){
                System.out.print(i);
            }
        }
    }
}
