package Logicmojo;

public class V10SockBuyAndSell {

    public static void main(String[] args) {
        int[] arr = {94,78,32,20,39,78,12};
        System.out.println(stockBuyAndSell(arr));
    }

    public static int stockBuyAndSell(int[] arr){
        int profit = 0;

        for(int i = 1; i < arr.length; i++){

            //compare current with previous element
            if(arr[i-1] < arr[i])
                profit += arr[i] - arr[i-1];
        }
        return profit;
    }
}
