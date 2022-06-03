package Arrays;

public class StockBuyAndSell {

    //naive solution
    private static int maxProfieN(int[] arr, int start, int end){
        if(end <= start)
            return 0;
        int profit = 0;

        for(int i = start; i <= end; i++){
            for(int j = i + 1; j <=end; j++){
                if(arr[i] < arr[j]){
                    int currentProfit = arr[j] - arr[i] + maxProfieN(arr,j+1,end);
                    profit = Math.max(profit,currentProfit);
                }
            }
        }

        return profit;
    }

    //Effective sol
    private static int maxProfitE(int[] arr){
        int profit = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] -arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,5,12};
        System.out.println(maxProfieN(arr,0,arr.length-1));
        System.out.println(maxProfitE(arr));
    }
}
