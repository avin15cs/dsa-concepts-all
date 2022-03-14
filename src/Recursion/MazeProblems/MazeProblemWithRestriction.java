package Recursion.MazeProblems;

public class MazeProblemWithRestriction {
    public static void main(String[] args) {
        boolean[][] maze=  {{true,true,true},
                        {true,false,true},
                        {true,true,true}};
        solve(0,0,maze,"");
    }
    static void solve(int r,int c, boolean[][] maze, String op){
        if(r==maze.length-1 && c==maze[0].length-1 ){
            System.out.println(op);
            return;
        }
        if(!maze[r][c])
            return;

        if(r<maze.length-1)
            solve(r+1,c,maze,op+'D');

        if(c<maze[0].length-1)
            solve(r,c+1,maze,op+'R');
    }
}
