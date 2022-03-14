package DynamicProgramming.KnapsackUnbounded;

public class RodCutting {

    public static void main(String[] args) {
        int ans=cutRod(new int[]{1, 5, 8, 9, 10, 17, 17, 20},8);
        System.out.println(ans);
    }
    public static int cutRod(int[] price, int n) {
        //code here
        int[][] t =new int[n+1][n+1];
        int[] len = new int[n];
        for(int i=0;i<n;i++)
            len[i]=i+1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(len[i-1]<=j){
                    t[i][j]=Math.max(t[i-1][j],price[i-1]+t[i][j-len[i-1]]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[n][n];
    }
}
