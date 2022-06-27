package Walmart;

import java.util.LinkedList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
//        list.add("leet");
//        list.add("code");
        list.add("a");
//        boolean ans=wordBreak("leetcode",list);
        boolean ans=wordBreak("a",list);
        System.out.println(ans);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
//         Set<String> set = new HashSet<>();
//         for(String p: wordDict){
//             String process[]=s.split(p);
//             int i=0;
//             while(i<process.length){
//                 set.add(process[i]);
//                 i++;
//             }
//         }

//         for(String p: wordDict){
//             if(!set.contains(p))
//                 return false;
//         }
//         return true;
        int[] dp=new int[s.length()];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<i;j++){
                String w2check=s.substring(j,i+1);

                if(wordDict.contains(w2check)) {
                    if(j>0)
                        dp[i] += dp[j - 1];
                    else
                        dp[i]+=1;
                }
            }
        }

        for(int i: dp)
            System.out.print(i+" ");
        return dp[s.length()-1]>0;

    }

}
