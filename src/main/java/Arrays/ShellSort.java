package Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        for(int gap = arr.length/2; gap > 0; gap/=2){

            for(int i = gap; i < arr.length; i++){

                int newElement = arr[i];
                int j = i-gap;

                while (j >=0 && arr[j] > newElement){
                    arr[j+gap] = arr[j];
                    j -= gap;
                }
                arr[j+gap] = newElement;
            }
        }

        for(int i : arr){
            System.out.println(i);
        }
    }
}
