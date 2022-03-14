package DynamicProgramming.Knapsack01;

public class CountSubset {
    static int t[][];
    static int n = 6;
    static int sum = 10;

    public static void main(String[] args) {
        int a[] = {2,3,5,6,8,10};
        knapsack(a, sum);
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                System.out.print(t[i][j] + "\t");
            }

            System.out.println();
        }
    }

    static void knapsack(int[] a, int sum) {
        int i, j;
        t = new int[n + 1][sum + 1];
        for (i = 0; i < n + 1; i++) {
            for (j = 0; j < sum + 1; j++) {
                if (i == 0)
                    t[i][j] = 0;
                if (j == 0)
                    t[i][j] = 1;
            }
        }

        for (i = 1; i < n + 1; i++) {
            for (j = 1; j < sum + 1; j++) {
                if (a[i - 1] <= j)
                    t[i][j] = t[i - 1][j - a[i - 1]] + t[i - 1][j];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
    }
}
