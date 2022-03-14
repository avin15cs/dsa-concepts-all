package Recursion.BackTracking.NQueens;

import java.util.*;

public class NQueensReturn {
    public static void main(String[] args) {
        List<List<String>> list = new LinkedList<List<String>>();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        char chess[][] = new char[n][n];
        for(char c[]:chess)
            Arrays.fill(c,'.');

        solve(0,chess,list);
        for(List<String> strings: list){
            System.out.print(strings);
        }
    }

    //Updating res value after complete updation of chess[][]

    static void solve(int row,char chess[][],List<List<String>> res){
        if(row==chess.length){
            res.add(getChessBoard(chess));
            return;
        }
        for(int col=0;col<chess.length;col++){
                if (isSafe(chess, row, col)) {
                    chess[row][col] = 'Q';
                    solve(row + 1, chess, res);
                    chess[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] chess, int row, int col) {
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='.')
                return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]=='.')
                return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j< chess.length;i--,j++){
            if(chess[i][j]=='.')
                return false;
        }
        return true;
    }

    private static List<String> getChessBoard(char[][] chess) {
        List<String> ans=new LinkedList<>();
        for(int i=0;i<chess.length;i++){
            String s=new String(chess[i]);
            ans.add(s);
        }
        return ans;

    }

}
