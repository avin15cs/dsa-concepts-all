package Stacks;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        if(isValid("()[]{}"))
            System.out.println("True");

        else
            System.out.println("False");
    }
    public static boolean isValid(String s) {
        Stack<Character> c=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')
                c.add(')');
            else if(ch=='{')
                c.add('}');
            else if(ch=='[')
                c.add(']');

            else if(c.isEmpty() || c.pop()!=ch)
                    return false;
        }
        return c.isEmpty();

    }
}
