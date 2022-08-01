package Logicmojo;

public class V8PrintMatrixDiagonal {

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4,5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},};

        int r = matrix.length;
        int c = matrix[0].length;

        printDiagonally(matrix,r,c);
    }

    static void printDiagonally(int[][] matrix, int r, int c){

        //print first half diagonal of the matrix
        for(int k = 0; k < r; k++){
            int i = k;
            int j = 0;
            while (i >=0){
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
        }

        //print second half diagonal of the matrix
        for(int k = 1; k < c; k++){
            int i = r - 1;
            int j = k;
            while (j <= c-1){
                System.out.print(matrix[i][j] + " ");
                i--;
                j++;
            }
        }
    }
}
