package Recursion.BackTracking.MazeProblem;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int n=4;
        int[][] m={{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        ArrayList<String> ans=findPath(m,n);
        for(String s: ans)
            System.out.println(s);
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        return findPath(m,0,0,n,"");

    }
    static ArrayList<String> findPath(int[][] m, int r, int c, int n, String out){
        if(r<0||c<0||r>=n||c>=n||m[r][c]==0){
            ArrayList<String> bres=new ArrayList<String>();
            return bres;
        }
        if(r==n-1 && c==n-1){
            ArrayList<String> bres=new ArrayList<String>();
//            System.out.println(out);
            bres.add(out);
            return bres;
        }
        ArrayList<String> down=new ArrayList<>();
        ArrayList<String> up=new ArrayList<>();
        ArrayList<String> left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();
        if(m[r][c]==1){
            m[r][c]=0;
            down=findPath(m,r+1,c,n,out+'D');
            up=findPath(m,r-1,c,n,out+'U');
            left=findPath(m,r,c-1,n,out+'L');
            right=findPath(m,r,c+1,n,out+'R');
            m[r][c]=1;
        }

        down.addAll(up);
        down.addAll(left);
        down.addAll(right);

        return down;
    }
}
