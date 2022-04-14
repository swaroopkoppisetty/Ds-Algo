package BasicMath;

/*
TrailingZeros naive approach
following code will work for small numbers but big numbers like 20 we have 19 digits. Hence we will
get overflow issues.

 */

public class TrailingZeros {
    public static void main(String[] args) throws Exception {
        System.out.println(trailingZeros(10));
    }

    public static int trailingZeros(int n) throws Exception {
        if(n < 0)
            throw new Exception("n should be greater than 0");
        int count = 0;
        int fact = 1;

        // Time complexity is theta(n) for this loop
        while (n>0){
            fact = fact * n;
            n--;
        }

        //time complexity is less than theta(n)
        //so time complexity is theta(n)
        while (fact % 10 ==0){
            fact = fact/10;
            count++;
        }
        return count;
    }
}
