import java.util.Arrays;

class ZeroMatrix{

    public static void zero(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<row.length;i++){
            if(row[i]){
                nullifyCol(matrix,i);
            }
        }

        for(int i=0;i<col.length;i++){
            if(col[i]){
                nullifyRow(matrix,i);
            }
        }
    }

    public static void nullifyCol(int[][] matrix,int i){
        for(int j=0;j<matrix[0].length;j++){
            matrix[j][i] =0;
        }
    }

    public static void nullifyRow(int[][] matrix,int i){
        for(int j=0;j<matrix.length;j++){
            matrix[i][j] =0;
        }
    }


    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,2,3},{4,0,6},{7,8,9}};
        zero(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
}