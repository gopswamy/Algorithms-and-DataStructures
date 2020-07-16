import java.util.Arrays;
/*
Rotate a 2D matrix clockwise once
*/
class RotateMatrix{
    
    public static int[][] rotate(int[][] matrix){

        int n = matrix.length;

        for(int layer = 0;layer<n/2;layer++){
            int first = layer;
            int last = n - layer -1;

            for(int i = first ; i<last;i++){
                int offset = i - first;
                int top = matrix[first][i];


                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        return matrix;

    }


    public static void main(String[] args){

        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        matrix = rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
}