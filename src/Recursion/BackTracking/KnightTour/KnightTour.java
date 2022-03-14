package Recursion.BackTracking.KnightTour;

import java.util.Arrays;
import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int[][] chess=new int[n][n];

        knightTour(chess,r,c,1 );
    }
    static void knightTour(int[][] chess, int row, int col,int move){
        if(row<0 || col<0 ||row>=chess.length||col>=chess.length||chess[row][col]>0){
            return;
        }
        if(move==chess.length* chess.length){
            chess[row][col]=move;
            display(chess);
            chess[row][col]=0;
            return;
        }
        chess[row][col]=move;
        knightTour(chess,row-2,col+1,move+1);
        knightTour(chess,row-1,col+2,move+1);
        knightTour(chess,row+2,col-1,move+1);
        knightTour(chess,row+1,col-2,move+1);
        knightTour(chess,row+2,col+1,move+1);
        knightTour(chess,row+1,col+2,move+1);
        knightTour(chess,row-2,col-1,move+1);
        knightTour(chess,row-1,col-2,move+1);
        chess[row][col]=0;
    }

    static void display(int[][] chess){
        for(int[] row:chess)
            System.out.println(Arrays.toString(row));
        System.out.println();
    }
}
