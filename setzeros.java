import java.lang.reflect.Array;
import java.util.Arrays;

public class setzeros {

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
       setZeroes(matrix);
        for(int i = 0;i< matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j] == -1){

                    matrix[i][j] =0;


                }
            }
        }
        for (int[] row : matrix) {

            System.out.println(Arrays.toString(row));

        }
    }

    public static void setZeroes(int[][] matrix) {


        for(int i = 0;i< matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){

                    zeros(i,j,matrix);


                }
            }
        }





    }



    public static void zeros(int i,int j,int[][] matrix){


        for(int row = 0;row<matrix[i].length;row++){
            matrix[i][row] =-1;

        }

        for(int col = 0;col < matrix.length;col++ ){
            matrix[col][j] =-1;
        }


    }
}
