package Walmart;
import java.util.Arrays;

public class MinPathSum {
    public static void main(String[] args) {

    }

    static int[][] t;

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        t = new int[m + 1][n + 1];
        for (int[] rows : t)
            Arrays.fill(rows, -1);
        return solve(m, n, grid);
    }

    public static int solve(int m, int n, int[][] grid) {
        if (m == 1 && n == 1)
            return grid[m - 1][n - 1];
        if (m < 1 || n < 1)
            return Integer.MAX_VALUE;

        if (t[m][n] != -1) return t[m][n];

        return t[m][n] = grid[m - 1][n - 1] + Math.min(solve(m - 1, n, grid), solve(m, n - 1, grid));

    }

    //Better solution
    public int solve1(int m, int n, int[][] grid) {
        if (m == 1 && n == 1)
            return grid[m - 1][n - 1];

        if (m == 1)
            return t[m][n] = grid[m - 1][n - 1] + solve(m, n - 1, grid);

        if (n == 1)
            return t[m][n] = grid[m - 1][n - 1] + solve(m - 1, n, grid);

        return t[m][n] = grid[m - 1][n - 1] + Math.min(solve(m - 1, n, grid), solve(m, n - 1, grid));
    }
}