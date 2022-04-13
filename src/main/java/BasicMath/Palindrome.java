package BasicMath;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(362));
    }

    public static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;
        while (temp > 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        return (rev == n);
    }
}
