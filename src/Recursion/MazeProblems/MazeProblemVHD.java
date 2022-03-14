package Recursion.MazeProblems;

import java.util.ArrayList;

public class MazeProblemVHD {
    static ArrayList<String> list =  new ArrayList<>();
    public static void main(String[] args) {
        solve(3,3,"");
        for(String i: list)
            System.out.println(i);
    }
    static void solve(int r, int c, String op){
        if(r==1 && c==1){
            list.add(op);
            return;
        }
        if(r>1)
            solve(r-1,c,op+'V');
        if(c>1)
            solve(r,c-1,op+'H');
        if(r>1 && c>1)
            solve(r-1,c-1,op+'D');
    }
}
