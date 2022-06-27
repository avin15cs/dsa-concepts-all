package DynamicProgramming.KnapsackUnbounded;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CoinChangeMaximumWays {

    static class Pair{
        int level;
        int data;
        Pair(int level,int data){
            this.level=level;
            this.data=data;
        }
    }
    public static void main(String[] args) {
        int ans=change(4,new int[]{1,2,3});
        System.out.println(ans);
    }
    public static int change(int amount, int[] coins) {
        int n=coins.length;

        int[][] t =new int[n+1][amount+1];

        for(int i=0;i<=n;i++)
            t[i][0]=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j)
                    t[i][j]=t[i-1][j]+t[i][j-coins[i-1]];

                else
                    t[i][j]=t[i-1][j];
            }
        }

        Map<Integer, Pair> map=new HashMap<>();
        map.put(0, new Pair(-1,12));
        return t[n][amount];
    }
}
