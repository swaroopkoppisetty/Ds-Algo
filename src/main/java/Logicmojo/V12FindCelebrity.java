package Logicmojo;

public class V12FindCelebrity {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 1, 1}};
        int n = matrix.length;
        System.out.println(findCelebrity(matrix,n));
    }

    static boolean knows(int x, int y, int[][] matrix){
        return matrix[x][y] == 1;
    }

    static int findCelebrity(int[][] matrix, int n){
        int x = 0;
        int y = n -1;

        while (x < y){
            if(knows(x,y,matrix)){
                x++;
            } else {
                y--;
            }
        }
        // we can have no celebrity
        for(int i = 0 ; i < n; i++){
            if(i != x && (knows(x,i,matrix) || !knows(i,x,matrix)))
                return -1;
        }
        return x;
    }
}
