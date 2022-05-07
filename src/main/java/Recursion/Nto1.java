package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    static int fun(int n){
        if(n == 0)
            System.exit(1);
        System.out.println(n);
        return fun(n-1);

    }
}
