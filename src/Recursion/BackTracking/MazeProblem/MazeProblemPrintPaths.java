package Recursion.BackTracking.MazeProblem;

import java.util.Arrays;

public class MazeProblemPrintPaths {
    public static void main(String[] args) {
        int[][] path={  {0,0,0},
                        {0,0,0},
                        {0,0,0}};
        boolean[][] maze={  {true,true,true},
                            {true,true,true},
                            {true,true,true}  };
        printPath(0,0,path,maze,"",1);
    }
    static void printPath(int r, int c, int[][] path, boolean[][] maze, String op, int step){
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step;
            System.out.println(op);
            for(int arr[]: path)
                System.out.println(Arrays.toString(arr));
            System.out.println();
            return;
        }
        if(!maze[r][c])
            return;
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1) {
            printPath(r+1,c,path,maze,op+'D',step+1);
        }
        if( c<maze[0].length-1) {
            printPath(r, c + 1, path, maze, op + 'R', step + 1);
        }
        if(r>0) {
            printPath(r-1,c,path,maze,op+'U',step+1);
        }
        if( c>0) {
            printPath(r, c - 1, path, maze, op + 'L', step + 1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
