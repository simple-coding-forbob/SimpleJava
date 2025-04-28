package chap14.section02.example03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {
    public static void main(String[] args) {
//        큐 생성 :
        Queue<Integer> queue = new LinkedList<>();

//        TODO: offer(값) : 값 넣기
        queue.offer(1);
        queue.offer(2);
//        TODO: poll()   : 값 꺼내서 화면에 표시
        System.out.println(queue.poll());
        
//      TODO: .peek() : 현재 큐의 맨앞에 있는 값 조회하기
        System.out.println(queue.peek());
    }
}