package chap14.section03.example02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApplication {
    public static void main(String[] args) {
//        TODO:
        List<Integer> list = new ArrayList<>();

//        TODO: 1) list 에 값넣기
//         사용법 : Collections.addAll(향상된배열, 값,값2,...)
        Collections.addAll(list, 1,2,3);
        System.out.println(list);         // [1,2,3]

//        TODO: 2) list 값들을 오른쪽으로 회전시키기
//          사용법 : Collections.rotate(향상된배열, 오른쪽칸이동)
        Collections.rotate(list, 1);
        System.out.println(list);          // [3,1,2]

//        TODO: 3) list 에 특정 값을 서로 교환하기
//          사용법 : Collections.swap(향상된배열, 시작인덱스, 끝인덱스)
//             => 시작인덱스값 <-> 끝인덱스값을 서로 교환
        Collections.swap(list, 0, 1);
        System.out.println(list);           // [3,2,1]

//        TODO: 4) list 를 정렬(오름/내림)
//           팀정렬 : 삽입정렬 + 합병정렬 (속도 : 퀵정렬과 같음)
//          사용법 : Collections.sort(향상된배열, Collections.reverseOrder())
//           4-1) 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);            // [3,2,1]
//        TODO: 4-2) 오름차순 정렬
//          사용법 : Collections.sort(향상된배열)
        Collections.sort(list);
        System.out.println(list);            // [1,2,3]

//        TODO: 6) list 에서 max/min 찾기
//           6-1) max(최대값) :
        System.out.println(Collections.max(list)); // 5
//           6-1) min(최소값) :
        System.out.println(Collections.min(list)); // 1
    }
}
