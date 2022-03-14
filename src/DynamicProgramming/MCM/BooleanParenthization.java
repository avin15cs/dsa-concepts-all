package DynamicProgramming.MCM;

import java.util.HashMap;
import java.util.Map;

public class BooleanParenthization {
    public static void main(String[] args) {
        String s="T^F|T";
        int ans=countWays(s.length(),s);
        System.out.println(ans);
    }
    static Map<String,Integer> map=new HashMap<>();

    static int countWays(int N, String S){
        map.clear();
        return solve(S,0,N-1,true);
    }
    static int solve(String s, int i, int j, boolean isTrue){
        if(i>j)
            return 0;
        if(i==j){
            if(isTrue)
                return s.charAt(i)=='T'?1:0;

            else
                return s.charAt(i)=='F'?1:0;
        }
        StringBuilder temp=new StringBuilder();
        temp.append(Integer.toString(i));
        temp.append(" ");
        temp.append(Integer.toString(j));
        temp.append(" ");
        temp.append(Boolean.toString(isTrue));
        String tempA=temp.toString();

        if(map.containsKey(tempA))
            return map.get(tempA);

        int ans=0;
        for(int k=i+1;k<k;k+=2){
            int lT=solve(s,i,k-1,true);
            int lF=solve(s,i,k-1,false);
            int rT=solve(s,k+1,j,true);
            int rF=solve(s,k+1,j,false);

            if(s.charAt(k)=='&'){
                if(isTrue)
                    ans=ans+lT*rT;

                else
                    ans=ans+lT*rF+lF*rT+lF*rF;
            }

            if(s.charAt(k)=='|'){
                if(isTrue)
                    ans+=lT*rF+lT*rT+lF*rT;

                else
                    ans+=lF*rF;
            }
            if(s.charAt(k)=='^'){
                if(isTrue)
                    ans+=lT*rF+lF*rT;

                else
                    ans+=lT*rT+lF*rF;
            }
        }
        map.put(tempA,ans);
        return map.get(tempA);
    }
}
