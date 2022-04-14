package BasicMath;

public class Lcm {

    public static void main(String[] args) {
        System.out.println(lcm(7,3));
        System.out.println(euclideanLcm(7,3));
    }

    //naive approach
    static int lcm(int a , int b){
        //wkt LCM of (a,b) will always greater than or equal to  than max(a,b)
        //so let us assume lcm is max(a,b)
        int lcm = Math.max(a,b);

        //run infinite loop until res is divisible by both a and b
        while (true){
            if(lcm % a ==0 && lcm % b == 0)
                return lcm;
            lcm++;
        }
        //it will take O(a*b)
    }

    //using formula
    // a*b = gcd(a,b) * lcm(a,b)
    //we can find gcd using euclidean algo

    static int gcd(int a ,int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
    static int euclideanLcm(int a, int b){

        return (a*b)/gcd(a,b);
    }
}
