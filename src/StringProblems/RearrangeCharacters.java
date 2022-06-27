package StringProblems;
import java.util.*;

public class RearrangeCharacters {

    public static void main(String[] args) {
        String out=rearrangeCharacters("ababaa");
        System.out.println(out);
    }

    public static String rearrangeCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

            max = Math.max(max, map.get(c));
        }


        if (max <= len - max + 1)
            return "1";

        return "0";
    }
}
