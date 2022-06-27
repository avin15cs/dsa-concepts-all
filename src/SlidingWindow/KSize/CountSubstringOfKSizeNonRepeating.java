package SlidingWindow.KSize;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringOfKSizeNonRepeating {
    public static void main(String[] args) {
        int ans=countGoodSubstrings("xyzzaz");
        System.out.println(ans);
    }

    public static int countGoodSubstrings(String s) {
        int n=s.length();

        int i=0,j=0,k=3,count=0;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        while(j<n){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);

//            if(j-i+1<k){
//                j++;
//            }
            if(j-i+1==k){
                if(map.size()==k)
                    count++;

                    char ci=s.charAt(i);
                    if(map.get(ci)==1)
                        map.remove(ci);
                    else
                        map.put(ci,map.get(ci)-1);

                i++;
            }
            j++;

        }
        return count;
    }
}
