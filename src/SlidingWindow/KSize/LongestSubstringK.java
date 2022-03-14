package SlidingWindow.KSize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringK {
    public static void main(String[] args) {
        int ans= longestkSubstr("aabacbebebe",3);
        System.out.println(ans);
    }
    public static int longestkSubstr(String s, int k) {
        // code here
        int i=0,j=0,count,max=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            char c=s.charAt(j);
            if(!map.containsKey(c)){
                map.put(c,1);

            }
            else{
                map.put(c,map.getOrDefault(c,0)+1);
            }

            if(map.size()<k) j++;

            else if(map.size()==k){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(map.size()>k){
                while(map.size()>k){
                    char ch=s.charAt(i);
                    if(map.get(ch)==1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch,map.getOrDefault(ch,0)-1);
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
