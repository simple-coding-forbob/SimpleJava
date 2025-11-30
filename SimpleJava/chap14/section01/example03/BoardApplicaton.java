package chap14.section01.example03;

import java.util.List;
import java.util.Vector;

public class BoardApplicaton {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        list.add(new Board("제목", "내용"));
        list.add(new Board("제목2", "내용2"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).subject);
            System.out.println(list.get(i).content);
        }
    }
}