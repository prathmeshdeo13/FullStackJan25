package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(21);
        stack.push(31);
        stack.push(41);
        stack.push(51);

        stack.forEach(s->{
            System.out.println(s);
                });

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
