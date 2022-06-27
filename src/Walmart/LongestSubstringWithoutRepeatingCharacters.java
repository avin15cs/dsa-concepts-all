package Walmart;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        int ans=lengthOfLongestSubstring(" ");
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0,j=0,maxl=0;
        HashSet<Character> set=new HashSet<>();
        while(j<n){
            char c=s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                maxl=Math.max(set.size(),maxl);
                j++;
            }
            else
                set.remove(s.charAt(i++));

        }
        return maxl;
    }
}
