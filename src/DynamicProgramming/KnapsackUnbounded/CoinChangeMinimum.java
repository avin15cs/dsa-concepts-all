package DynamicProgramming.KnapsackUnbounded;
import java.util.Arrays;

public class CoinChangeMinimum {

    public static void main(String[] args) {
        int ans=coinChange(new int[]{25,10,5},30);
        System.out.println(ans);
    }
    public static int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int t[][]=new int[n+1][amount+1];

        Arrays.fill(t[0],Integer.MAX_VALUE-1);
//        for(int i=1;i<=amount;i++){
//            if(i%coins[0]==0)
//                t[1][i]=i/coins[0];
//            else
//                t[1][i]=Integer.MAX_VALUE-1;
//        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j)
                    t[i][j]=Math.min(t[i-1][j],t[i][j-coins[i-1]]+1);
                else
                    t[i][j]=t[i-1][j];
            }
        }
        for(int[] row:t)
            System.out.println(Arrays.toString(row));

        return (t[n][amount]==Integer.MAX_VALUE-1)?-1:t[n][amount];
    }
}
