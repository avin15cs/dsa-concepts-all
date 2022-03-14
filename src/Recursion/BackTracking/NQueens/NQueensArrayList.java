package Recursion.BackTracking.NQueens;

import java.util.ArrayList;
import java.util.Scanner;

public class NQueensArrayList {
    public static void main(String[] args) {
        int n= new Scanner(System.in).nextInt();
        int[][] chess=new int[n][n];
        ArrayList<ArrayList<Integer>> sol=solve(chess,0);
        for(ArrayList<Integer> integer: sol)
            System.out.println(integer);

    }
    static ArrayList<ArrayList<Integer>> solve(int[][] chess, int row){
        if(row==chess.length){
            ArrayList<ArrayList<Integer>> bres=new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<chess.length;i++){
                for(int j=0;j<chess.length;j++){
                    System.out.print(chess[i][j]+" ");
                    if(chess[i][j]==1)
                        ans.add(j+1);
                }
                System.out.println();
            }
            bres.add(ans);
            System.out.println();
            return bres;
        }
        ArrayList<ArrayList<Integer>> lres=new ArrayList<ArrayList<Integer>>();

        for(int col=0;col<chess.length;col++){
            if(isSafe(chess,row,col)){
                chess[row][col]=1;
                lres.addAll(solve(chess,row+1));
                chess[row][col]=0;
            }
        }
        return lres;

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
}
