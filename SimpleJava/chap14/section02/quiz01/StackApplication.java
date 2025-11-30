package chap14.section02.quiz01;

import java.util.Stack;

public class StackApplication {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//      TODO: 값넣기 : 10 20
        stack.push(10);
        stack.push(20);

        System.out.println(stack.pop());
    }
}