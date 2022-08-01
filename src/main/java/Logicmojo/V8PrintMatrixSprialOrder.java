package Logicmojo;

public class V8PrintMatrixSprialOrder {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr){

        int fc = 0, lc = arr.length -1, fr = 0, lr = arr.length -1;

        while (fc < lc && fr < lr){

            int i = fc;
            int j;
            for(j = fc; j < lc; j++){
                System.out.println(arr[i][j]);
            }

            j = lc;
            for(i = fr; i < lr; i++){
                System.out.println(arr[i][j]);
            }

            i = lr;
            for(j = lc; j > fc; j--){
                System.out.println(arr[i][j]);
            }

            j = fc;
            for(i = lr; i > fr; i--){
                System.out.println(arr[i][j]);
            }

            fc++;
            lc--;
            fr++;
            lr--;
        }
    }
}
