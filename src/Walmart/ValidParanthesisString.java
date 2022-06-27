package Walmart;

import java.util.Stack;

public class ValidParanthesisString {
    public static void main(String[] args) {
//        boolean ans=checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()");
        boolean ans=checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())");
        System.out.println(ans);
    }

    public static boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.add('(');

            else if (s.charAt(i) == '*')
                count++;

            else {
                if (stack.size() != 0 && stack.peek() == '(')
                    stack.pop();

                else if (stack.size() == 0) {
                    if (count != 0) count--;

                    else return false;
                }
            }
        }
//        System.out.println(count);
//        System.out.println(stack.peek());
        if(stack.size()!=0){
            if(count<stack.size()) return false;
        }

        return true;
    }
}
