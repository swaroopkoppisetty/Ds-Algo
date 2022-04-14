package BasicMath;
//A number which divisble by itself and 1 is called prime number
public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(49));
        System.out.println(effectiveSol(1031));
    }

    //naive solution
    //O(n)
    static boolean isPrime(int n){

        if(n==1)
            return false;
        // return true if n=2,3
        if(n==2 || n==3)
            return true;

        int count = 2;
        //check dividing n with all the numbers <= n
        while (count<n){
            if(n % count ==0)
                return false;
            count++;
        }
        return true;
    }

    //O(sqrt(n))
    static boolean effectiveSol(int n){
        if(n==1)
            return false;
        // return true if n=2,3
        if(n==2 || n==3)
            return true;

        //check for 2 and 3 to reduce iterations
        if(n % 2==0 || n % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= n){
            //if we remove numbers which are divisble by 2 and 3 we left out with
            //5,7,11,13,19....
            //increment i with 6 and check for i+2
            if(n % i == 0 || n%(i+2) == 0)
                return false;

            i = i+6;
        }
        return true;
    }



}
