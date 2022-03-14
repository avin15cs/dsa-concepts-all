package Recursion;

import java.util.Stack;

public class MiddleElementStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Input Stack: "+ stack);
        midElement(stack);
        System.out.println("Output Stack: "+stack);
    }
    static void midElement(Stack<Integer> s){
        if(s.size()==1)
            return;
        int mid=(s.size()+1)/2;
        delete(s,mid);
    }
    static void delete(Stack<Integer> stack,  int mid) {
        if(mid==1) {
            stack.pop();
            return;
        }
        int temp=stack.pop();
        delete(stack,mid-1);
        stack.push(temp);
    }
}
