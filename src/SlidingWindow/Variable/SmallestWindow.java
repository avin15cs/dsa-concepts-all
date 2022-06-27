package SlidingWindow.Variable;

import java.util.HashMap;

public class SmallestWindow {
    public static void main(String[] args) {
        String ans=smallestWindow("timetopractice","toc");
        System.out.println(ans);
    }

    public static String smallestWindow(String s, String p)
    {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count=map.size();
        int i=0,j=0,n=s.length(),ans=Integer.MAX_VALUE;
        StringBuilder temp=new StringBuilder();
        String fans=s;
        while(j<n){
            char c=s.charAt(j);
            temp.append(c);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                    count--;
            }

            while(count==0){
//                ans = Math.min(ans,j-i+1);
                fans=(temp.length()<fans.length())? String.valueOf(temp) :fans;

                char ch=s.charAt(i);

                if(map.containsKey(ch)){
                    int k=map.get(ch);
                    if(k==0) count++;

                    map.put(ch,k+1);
                }
                temp.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return fans;
    }
}
