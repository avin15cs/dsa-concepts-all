package GFG;

public class RemoveAdjacentDuplicates2 {
    public static void main(String[] args) {
        String out=remove("abccbccba");
//        String out=remove("aa");
        System.out.println(out);
    }
    static String remove(String s){
        StringBuilder res= new StringBuilder();
        char k = 0;
        int i = 0;
        while(i<s.length()) {
            char c=s.charAt(i);
            int freq=0;
            while(i<s.length() && c==s.charAt(i))
            {
                i++;freq++;
            }
            if(freq==1)
                res.append(c);
        }
        if(res.toString().equals(s))
            return s;
        return remove(res.toString());

    }
}
