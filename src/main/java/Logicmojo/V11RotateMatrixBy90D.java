package Logicmojo;

public class V11RotateMatrixBy90D {

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int n = matrix.length;

        rotateMatrix(matrix);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    public static void rotateMatrix(int[][] matrix){
        int n = matrix.length;

        //find the symmetry of matrix
        /*
            when we rotate matrix by 90
            [i][j] will shift to [j][n-i-1]
            [j][n-i-1] will shift to [n-i-1][n-j-1]
            [n-i-1][n-j-1] will shift to [n-j-1][n -(n-i-1) -1] => [n-j-1][i]
            [n-j-1][i] will shift to [i][j]

         */
         for(int i = 0; i < n/2; i++){
             for(int j = i; j < n - i - 1; j++){
                 int temp = matrix[j][n-i-1];
                 matrix[j][n-i-1] = matrix[i][j];
                 matrix[i][j] = matrix[n-j-1][i];
                 matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                 matrix[n-i-1][n-j-1] = temp;
             }
         }
    }

}
