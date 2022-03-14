package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams {
    public static void main(String[] args) {
        List<Integer> list = findAnagrams("cbaebabacd","abc");
        System.out.println(list);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0, j=0, len=s.length(),k=p.length(),count= map.size();
        while(j<len){
            char c=s.charAt(j);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0)
                        count--;
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                //ans
                if(count==0)
                    list.add(i);


                char fc=s.charAt(i);

                //slide window
                if(map.containsKey(fc)){
                    map.put(fc,map.get(fc)+1);
                    if(map.get(fc)==1){
                        count++;
                    }
                }
                i++;j++;
            }
        }
        return list;
    }
}