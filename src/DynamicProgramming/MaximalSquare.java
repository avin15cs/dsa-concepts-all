package DynamicProgramming;

public class MaximalSquare {
    public static void main(String[] args) {

    }
    public static int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;

        int[][] t = new int[matrix.length+1][matrix[0].length+1];
        int result=0;
        for(int i=1;i<=matrix.length;i++){
            for(int j=1;j<= matrix[0].length ;j++){
                if(matrix[i-1][j-1]=='1') {
                    t[i][j] = Math.min(Math.min(matrix[i][j - 1], t[i - 1][j - 1]), t[i - 1][j]) + 1;
                    result=Math.max(t[i][j],result);
                }
            }
        }
        return result*result;
    }
}
