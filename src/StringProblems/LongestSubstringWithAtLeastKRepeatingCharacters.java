package StringProblems;

//Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k.
//
//
//
//Example 1:
//
//Input: s = "aaabb", k = 3
//Output: 3
//Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longestSubstring("ababbc",2));
    }

//    Divide and conquer Technique
    public static int longestSubstring(String s, int k) {
        int[] freq=new int[26];
        char[] str=s.toCharArray();

        for(char c: str)
            freq[c-'a']++;

        boolean valid=true;

        int start=0;
        int maxLen=0;
        for(int end=0;end<s.length();end++){
            if(freq[str[end]-'a']>0 && freq[str[end]-'a']<k){
                String subString=s.substring(start, end);
                maxLen=Math.max(maxLen,longestSubstring(subString,k));
                start=end+1;
                valid=false;
            }
        }
        if(valid) return s.length();

        else    return Math.max(maxLen, longestSubstring(s.substring(start),k));
    }
}
