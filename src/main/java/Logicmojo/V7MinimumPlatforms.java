package Logicmojo;

import java.util.Arrays;

/*
Input ? The list of arrival time and the departure times, and the number of items in the list
Input:  arr[]  = {900,  940, 950,  1100, 1500, 1800}
dep[]  = {910, 1200, 1120, 1130, 1900, 2000}
find min platforms to accommodate
 */
public class V7MinimumPlatforms {

    public static void main(String[] args) {
        int[] arrival = {900,  940, 950,  1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minPlatforms(arrival,departure));
    }

    public static int minPlatforms(int[] arr, int[] dep){
        int i = 0, j = 0;
        int maxPlatforms = 0;
        int platform =0;
        Arrays.sort(arr);
        Arrays.sort(dep);

        while (i < arr.length && j < arr.length){

            if(arr[i] < dep[j]){
                platform++;
                i++;
                if(platform > maxPlatforms)
                    maxPlatforms = platform;
            } else {
                platform--;
                j++;
            }
        }

        return maxPlatforms;

    }
}
