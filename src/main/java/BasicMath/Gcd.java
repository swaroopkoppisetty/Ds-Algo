package BasicMath;

public class Gcd {

    public static void main(String[] args) {
        System.out.println(gcd(7,13));
        System.out.println(euclideanGcd(17,13));
    }

    //naive solution
    //O(min(a,b)) -> worst case
    static int gcd(int a, int b){
        //Gcd will always be <= min of a and b. so let's assume gcd is min of a and b
        int res = Math.min(a,b);

        //check from min(a,b) which number is multiple of both a and b
        while (res>0){
            if(a%res==0 && b%res==0)
                break;
            res--;
        }

        return res;
    }

    static int euclideanGcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
