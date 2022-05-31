package Arrays;
//{7,4,3,10,5,6,7,2}
public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = {7,4,3,10,5,6,7,2};
        System.out.println(leadersInArray(arr));
    }

    private static boolean leadersInArray(int[] arr){
        int n = arr.length;
        int currLeader = arr[n-1];
        System.out.println(currLeader);

        for(int i = n -2; i >=0 ; i--){
            if(arr[i] > currLeader){
                currLeader = arr[i];
                System.out.println(currLeader);
            }

        }

        return false;
    }
}
