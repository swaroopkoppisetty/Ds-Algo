package Logicmojo;

public class V11FindElemetInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,40},
            {15,25,36,46},
            {28,29,37,48},
            {32,33,39,50}
        };

        int n = matrix.length;

        findElement(matrix,n,32);
    }

    static void findElement(int[][] matrix, int n, int value){
        int i = 0;
        int j = n -1;

        while (i < n && j >= 0){
            if(matrix[i][j] == value){
                System.out.println(i + " " + j);
                break;
            }

            if(matrix[i][j] > value)
                j--;
            else
                i++;
        }
    }
}
