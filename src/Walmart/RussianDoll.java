package Walmart;
import java.util.Arrays;

public class RussianDoll {
    public static void main(String[] args) {
        int[][] envelopes={{5,4},{6,4},{6,7},{2,3}};
        int ans=maxEnvelopes(envelopes);
        System.out.println(ans);
    }

    public static int maxEnvelopes(int[][] envelopes) {
        int t[]=new int[envelopes.length];
        Arrays.fill(t,1);
        int overallMax=0;
        for(int i=0;i<envelopes.length;i++){
            for(int j=0;j<i;j++){
                if(envelopes[j][0]<envelopes[i][0] && envelopes[j][1]<envelopes[i][1]){
                    t[i]=Math.max(t[i],t[j]+1);
                }

            }

            overallMax=Math.max(overallMax,t[i]);
        }

        return overallMax;
    }
}
