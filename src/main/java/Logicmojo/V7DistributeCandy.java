package Logicmojo;
/*
There are N children standing in a line with some rating value.
 You want to distribute a minimum number of candies to these children such that:
 Each child must have at least one candy.
  The children with higher ratings will have more candies than their neighbors.
  You need to write a program to calculate the minimum candies you must give.
 */
public class V7DistributeCandy {

    public static void main(String[] args) {
        int[] arr = {1,5,2,1};
        System.out.println(distributeCandy(arr));
    }

    public static int distributeCandy(int[] rating){
        int n = rating.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;

        for(int i = 1; i < n; i++){
            if(rating[i] > rating[i-1]){
                left[i] = left[i-1] + 1;
            } else
                left[i] = 1;
        }

        right[n-1] = 1;

        for (int i = n -2; i >=0; i--){
            if(rating[i] > rating[i+1]){
                right[i] = right[i+1] + 1;
            } else
                right[i] = 1;
        }

        int candies = Math.max(left[0],right[0]);

        for(int i = 1; i<n ; i++){
            candies += Math.max(left[i],right[i]);
        }

        return candies;
    }
}
