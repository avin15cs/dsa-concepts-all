package DynamicProgramming.Knapsack01;

public class KnapSack {
    static int t[][];
    static int n=4;
    static int W=8;

    public static void main(String[] args) {
        int w[]={3,4,5,6};
        int[] val={2,3,4,1};

        knapsack(w,val,W);
        for(int i=0;i<n+1;i++) {
            for (int j = 0; j < W + 1; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
    }
    static void knapsack(int[] w, int[] val, int W){
        int i, j;
        t=new int[n+1][W+1];
        for(i=0;i<n+1;i++){
            for(j=0;j<W+1;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }

        for(i=1;i<n+1;i++){
            for(j=1;j<W+1;j++){
                if(w[i-1]<=j)
                    t[i][j]=Math.max(val[i-1]+t[i-1][j-w[i-1]],t[i-1][j]);
                else
                    t[i][j]=t[i-1][j];
            }
        }
    }
}
