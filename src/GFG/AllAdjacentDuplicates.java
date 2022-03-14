package GFG;

import java.util.Stack;

public class AllAdjacentDuplicates {
    public static void main(String[] args) {
        String out=remove("abccbccba");
//        String out=remove("aa");
        System.out.println(out);
    }
    static String remove(String s) {
        // code here
        StringBuilder res = new StringBuilder();

        Stack<Pair> stack = new Stack<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(stack.size()==0)
                stack.add(new Pair(c,1));

            else if(stack.size()>0) {
                if(stack.peek().ch==c){
                    int num=stack.peek().count;
                    stack.pop();
                    stack.push(new Pair(c,num+1));
                }
                else{
                    if(stack.peek().count>1)
                        stack.pop();
                    stack.add(new Pair(c,1));
                }
            }
            i++;
        }
        while(stack.size()>0) {
            if(stack.peek().count==1)
            {
                res.append(stack.peek().ch);
            }
            stack.pop();
        }
        res.reverse();
        if(String.valueOf(res).equals(s))
            return s;
        return remove(String.valueOf(res));
//        return String.valueOf(res);
    }
}
class Pair{
    char ch;
    int count;
    public Pair(char ch,  int count){
        this.ch=ch;
        this.count=count;
    }
}