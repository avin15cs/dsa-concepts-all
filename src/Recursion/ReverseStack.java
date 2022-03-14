package Recursion;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Original Stack: "+stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: "+stack);
    }
    static void reverseStack(Stack<Integer> s){
        if(s.size()==0)
            return;

        int temp=s.pop();
        reverseStack(s);
        insert(s, temp);
    }
    static void insert(Stack<Integer> stack,  int k) {
        if(stack.size()==0) {
            stack.push(k);
            return;
        }
        int temp=stack.pop();
        insert(stack,k);
        stack.push(temp);
    }
}
