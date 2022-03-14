package Recursion.BackTracking.FloodFill;

public class FloodFill {
    public static void main(String[] args) {
        int[][] maze={  {0,1,0},
                {0,0,0},
                {0,0,0}};
        boolean[][] visited={  {false,false,false},
                {false,false,false},
                {false,false,false}  };
        int[][] path={  {0,0,0},
                {0,0,0},
                {0,0,0}};
        floodfill(0,0,"",maze,visited,path);
    }
    static void floodfill(int row,int col, String op, int[][] maze,boolean[][] visited,int[][] path){
        if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1||visited[row][col])
            return;

        if(row== maze.length-1 && col==maze[0].length-1){
            System.out.println(op);
            return;
        }
        visited[row][col]=true;
        floodfill(row-1,col,op+'U',maze,visited,path);
        floodfill(row,col-1,op+'L',maze,visited,path);
        floodfill(row+1,col,op+'D',maze,visited,path);
        floodfill(row,col+1,op+'R',maze,visited,path);
        visited[row][col]=false;
    }
}
