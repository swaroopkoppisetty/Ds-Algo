package BasicMath;
/*
Count digits of a number

We will see three approaches to solve this problem
1 -> Iterative
2 -> Recursive
3 -> Logarithmic

*/

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("Iterative method -> No. of digits for given number is "+ iterativeSol(123));
        System.out.println("Recursive method -> No. of digits for given number is "+ recursiveSol(123));
        System.out.println("Logarithmic method -> No. of digits for given number is "+ logSol(123));
    }

    public static int iterativeSol(int n){
        int count = 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static  int recursiveSol(int n){
        if(n==0)
            return 0;
        return 1 + recursiveSol(n/10);
    }

    public  static int logSol(int n){
        return (int) Math.log10(n) + 1;
    }
}
