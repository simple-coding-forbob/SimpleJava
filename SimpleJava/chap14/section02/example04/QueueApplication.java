package chap14.section02.example04;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApplication {
    public static void main(String[] args) {
        Queue<Coin> queue = new LinkedList<>();

//      TODO: .offer(값) : 큐에 자료(객체를생성해서) 넣기
        queue.offer(new Coin(100));
        queue.offer(new Coin(50));

//      TODO: .poll() : 큐에서 자료 꺼내기, 큐에서 삭제됨
        Coin coin = queue.poll();
        System.out.println(coin);

//      TODO: .peek() : 현재 큐의 맨앞에 있는 값 조회하기
        System.out.println(queue.peek());
    }
}
