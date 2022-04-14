package BasicMath;
/*

In previous approach we are facing over flow issues with big number and  it takes O(n) time
In this we can solve both the issues.
We can find number of zeros using number of 2 and 5s
ex: 5!
1*2*3*4*5  -> 2*5 = 10 therefore we have one trailing 0 in 5!

*number of 5s always lesser than 2s therefore if we find number of 5s we can find number of trailing zeros
n/5 + n/25 + n/125 + ...... -> formula to find number of 5s
every 5th element will have one 5, every 25th element will have two 5s,
every 125th elemnt will have three 5s

 */
public class TrailingZerosEffective {
    public static void main(String[] args) {
        System.out.println(trailingZeros(4));
    }
    static int trailingZeros(int n){
        int count = 0;

        //O(logn)
        for(int i =5; i<=n; i=i*5){
            count = count + n/i;
        }
        return count;
    }
}
