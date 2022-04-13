package BasicMath;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(iterativeSol(4));
        System.out.println(recursiveSol(5));
    }

    public static long iterativeSol(int n){
        if(n==0 || n==1)
            return 1;
        int prod = 1;
        while (n>0){
            prod = prod * n;
            n--;
        }
        return prod;
    }

    public  static long recursiveSol(int n){
        if (n == 0 || n==1)
            return 1;
        return n * recursiveSol(n-1);
    }
}
