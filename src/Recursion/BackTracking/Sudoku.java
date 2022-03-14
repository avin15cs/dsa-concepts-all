package Recursion.BackTracking;

import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {

    }
    static void solve(int[][] matrix,int i, int j){

        if(i==matrix.length){
            display(matrix);
            return;
        }
        int nexti=0;
        int nextj=0;

        if(nextj ==matrix[0].length-1){
            nexti=i+1;
            nextj=0;
        }else{
            nexti=i;
            nextj=j+1;
        }

        if(matrix[i][j]!=0)
            solve(matrix,nexti,nextj);
        else{
            for(int pos=1;pos<=9;pos++){
                if(isValid(matrix,i,j,pos)){
                    matrix[i][j]=pos;
                    solve(matrix,nexti,nextj);
                    matrix[i][j]=0;
                }
            }
        }
    }
    static boolean isValid(int[][] matrix, int row, int col,int val){
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[row][i]==val)
                return false;
        }
        for(int j=0;j<matrix.length;j++){
            if(matrix[j][col]==val)
                return false;
        }
        int smi=3*(row/3);
        int smj=3*(col/3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[smi+i][smj+j]==val)
                    return false;
            }
        }
        return true;
    }

    static void display(int[][] matrix){
        for(int row[]: matrix)
            System.out.println(Arrays.toString(row));
    }
}
