package BasicMath;

public class Fibonacci {

    public static int fib(int n) {

        int a =0, b=1, sum =0;

        if(n == 1) return b;

        for(int i = n; i>1; i--){
            sum = a + b;
            a = b;
            b =sum;

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(fib(50));
    }
}
