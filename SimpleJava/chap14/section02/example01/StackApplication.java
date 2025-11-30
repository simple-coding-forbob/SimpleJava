package chap14.section02.example01;

import java.util.Stack;

public class StackApplication {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//      TODO: 값넣기 : 1 2
        stack.push(1);
        stack.push(2);

//      TODO: 값꺼내서 출력하기 : 2 1
        System.out.println(stack.pop()); // 2

//      TODO: .peek() : 현재 스택의 맨위의 값 조회하기
        System.out.println(stack.peek());
    }
}