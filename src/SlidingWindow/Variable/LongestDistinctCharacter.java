package SlidingWindow.Variable;

import java.util.HashSet;

public class LongestDistinctCharacter {
    public static void main(String[] args) {
        System.out.println(longestSubstrDistinctChars("geeksforgeeks"));
    }
    static int longestSubstrDistinctChars(String S){
        // code here
        char c;
        int i=0,j=0,max=0;
        HashSet<Character> set = new HashSet<>();
        // set.add(S.charAt(0));
        while(j<S.length()){
            c=S.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                max=Math.max(max,j-i+1);
            }

            else{
                while(S.charAt(i)!=c){
                    set.remove(S.charAt(i++));
                }
                i++;
            }
            j++;
        }
        return max;
    }
}
