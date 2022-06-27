package DynamicProgramming.LinearDP.TopDown;

public class LISubsequence {
    public static void main(String[] args) {
        int[] arr={3,4,10,7,8,6,15};
        int n=7;
        int[] dp = new int[n];
//        dp[0]=1;
        int overallMax=0;
        for(int i=0;i< dp.length;i++){
            int max=0;

            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    if(dp[j]>max)
                        max=dp[j];
                }
            }

            dp[i]=max+1;
            if(dp[i]>overallMax)
                overallMax=dp[i];
        }
        System.out.println(overallMax);
    }

}
