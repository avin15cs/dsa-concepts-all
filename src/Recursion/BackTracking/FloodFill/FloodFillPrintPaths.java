package Recursion.BackTracking.FloodFill;

import java.util.Arrays;

public class FloodFillPrintPaths {

    public static void main(String[] args) {
        int[][] maze={  {0,0,1},
                {0,0,0},
                {0,0,0}};
        int[][] path={  {0,0,0},
                {0,0,0},
                {0,0,0}};
        boolean[][] visited={  {false,false,false},
                {false,false,false},
                {false,false,false}  };

        floodfill(0,0,"",maze,path,visited,1);
    }
    static void floodfill(int row,int col, String op, int[][] maze,int[][] path,boolean[][] visited,int steps){
        if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1||visited[row][col])
            return;

        if(row== maze.length-1 && col==maze[0].length-1){
            path[row][col]=steps;
            System.out.println(op);
            for(int r[]:path)
                System.out.println(Arrays.toString(r));
            return;
        }
        visited[row][col]=true;
        path[row][col]=steps;
        floodfill(row-1,col,op+'U',maze,path,visited,steps+1);
        floodfill(row,col-1,op+'L',maze,path,visited,steps+1);
        floodfill(row+1,col,op+'D',maze,path,visited,steps+1);
        floodfill(row,col+1,op+'R',maze,path,visited,steps+1);
        path[row][col]=0;
        visited[row][col]=false;
    }
}
