package Recursion.BackTracking.MazeProblem;

public class MazeProblemWithBackTracking {
    public static void main(String[] args) {
        //This problem is just extension of MazeProblemWithRestriction
        boolean[][] maze={{true,true,true},
                {true,true,true},
                {true,true,true}};
        solve(0,0,maze,"");
    }
    static void solve(int r, int c, boolean[][] maze,String op ){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(op);
            return;
        }
        if(!maze[r][c])
            return;

        maze[r][c]=false;
        if(r<maze.length-1)
            solve(r+1,c,maze,op+'D');

        if(c<maze[0].length-1)
            solve(r,c+1,maze,op+'R');

        if(r>0)
            solve(r-1,c,maze,op+'U');

        if(c>0)
            solve(r,c-1,maze,op+'L');

        maze[r][c]=true;
    }
}
