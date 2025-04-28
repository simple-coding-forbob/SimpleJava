package chap14.section02.example02;

import java.util.Stack;

public class StackApplication {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<>();

        stack.push(new Coin(100));       
        stack.push(new Coin(50));        

//        TODO: .pop() : 스택에서 값 꺼내기
        Coin coin = stack.pop();
        System.out.println(coin.getValue());

//      TODO: .peek() : 현재 스택의 맨위의 값 조회하기
        System.out.println(stack.peek());
    }
}
