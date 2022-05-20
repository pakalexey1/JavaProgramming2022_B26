package day60_collections;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of my stack: " + stack.peek());//returns what at the top of the stack
        stack.pop(); // removes the element at the top of the stack
        System.out.println(stack);
        System.out.println("Top of my stack: " + stack.peek());//returns what at the top of the stack

        System.out.println(stack.pop());// removes 'c' which is at the top of the stack and returns it
        System.out.println(stack);

        System.out.println(stack.remove(0)); // remove the element from index 0, not following LIFO rule
        System.out.println(stack);
    }
}
