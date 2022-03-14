package Recursion.BackTracking.NQueens;

import java.util.Scanner;

public class NQueensII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] chess=new int[n][n];
        int count=printNQueens(chess,0);
        System.out.println("Count= "+count);
    }
    static int printNQueens(int[][] chess,int row){
        if(row==chess.length){
            display(chess);
            return 1;
        }
        int count=0;
        for(int col=0;col<chess.length;col++){
            if(isSafe(chess,row,col)){
                chess[row][col]=1;
                count+=printNQueens(chess,row+1);
                chess[row][col]=0;
            }
        }
        return count;
    }
    static boolean isSafe(int[][] chess, int row, int col){
        //checking Up
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]==1)
                return false;
        }
        //checking Up left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1)
                return false;
        }
        //checking Up right
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
            if(chess[i][j]==1)
                return false;
        }
        return true;
    }
    static void display(int[][] chess){
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                if(chess[i][j]==1)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
